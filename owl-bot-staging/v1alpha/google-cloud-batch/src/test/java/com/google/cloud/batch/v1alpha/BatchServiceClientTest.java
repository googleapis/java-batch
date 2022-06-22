/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.batch.v1alpha;

import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListJobsPagedResponse;
import static com.google.cloud.batch.v1alpha.BatchServiceClient.ListTasksPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class BatchServiceClientTest {
  private static MockBatchService mockBatchService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BatchServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBatchService = new MockBatchService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBatchService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    BatchServiceSettings settings =
        BatchServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BatchServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
            .setUid("uid115792")
            .setPriority(-1165461084)
            .addAllTaskGroups(new ArrayList<TaskGroup>())
            .addAllDependencies(new ArrayList<JobDependency>())
            .setAllocationPolicy(AllocationPolicy.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setStatus(JobStatus.newBuilder().build())
            .setNotification(JobNotification.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLogsPolicy(LogsPolicy.newBuilder().build())
            .addAllNotifications(new ArrayList<JobNotification>())
            .build();
    mockBatchService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Job job = Job.newBuilder().build();
    String jobId = "jobId101296568";

    Job actualResponse = client.createJob(parent, job, jobId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateJobRequest actualRequest = ((CreateJobRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(job, actualRequest.getJob());
    Assert.assertEquals(jobId, actualRequest.getJobId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Job job = Job.newBuilder().build();
      String jobId = "jobId101296568";
      client.createJob(parent, job, jobId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createJobTest2() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
            .setUid("uid115792")
            .setPriority(-1165461084)
            .addAllTaskGroups(new ArrayList<TaskGroup>())
            .addAllDependencies(new ArrayList<JobDependency>())
            .setAllocationPolicy(AllocationPolicy.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setStatus(JobStatus.newBuilder().build())
            .setNotification(JobNotification.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLogsPolicy(LogsPolicy.newBuilder().build())
            .addAllNotifications(new ArrayList<JobNotification>())
            .build();
    mockBatchService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Job job = Job.newBuilder().build();
    String jobId = "jobId101296568";

    Job actualResponse = client.createJob(parent, job, jobId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateJobRequest actualRequest = ((CreateJobRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(job, actualRequest.getJob());
    Assert.assertEquals(jobId, actualRequest.getJobId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createJobExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String parent = "parent-995424086";
      Job job = Job.newBuilder().build();
      String jobId = "jobId101296568";
      client.createJob(parent, job, jobId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
            .setUid("uid115792")
            .setPriority(-1165461084)
            .addAllTaskGroups(new ArrayList<TaskGroup>())
            .addAllDependencies(new ArrayList<JobDependency>())
            .setAllocationPolicy(AllocationPolicy.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setStatus(JobStatus.newBuilder().build())
            .setNotification(JobNotification.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLogsPolicy(LogsPolicy.newBuilder().build())
            .addAllNotifications(new ArrayList<JobNotification>())
            .build();
    mockBatchService.addResponse(expectedResponse);

    JobName name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]");

    Job actualResponse = client.getJob(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetJobRequest actualRequest = ((GetJobRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      JobName name = JobName.of("[PROJECT]", "[LOCATION]", "[JOB]");
      client.getJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getJobTest2() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setName(JobName.of("[PROJECT]", "[LOCATION]", "[JOB]").toString())
            .setUid("uid115792")
            .setPriority(-1165461084)
            .addAllTaskGroups(new ArrayList<TaskGroup>())
            .addAllDependencies(new ArrayList<JobDependency>())
            .setAllocationPolicy(AllocationPolicy.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setStatus(JobStatus.newBuilder().build())
            .setNotification(JobNotification.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLogsPolicy(LogsPolicy.newBuilder().build())
            .addAllNotifications(new ArrayList<JobNotification>())
            .build();
    mockBatchService.addResponse(expectedResponse);

    String name = "name3373707";

    Job actualResponse = client.getJob(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetJobRequest actualRequest = ((GetJobRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getJobExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String name = "name3373707";
      client.getJob(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteJobTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteJobTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBatchService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteJobAsync(name).get();

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteJobRequest actualRequest = ((DeleteJobRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteJobAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listJobsTest() throws Exception {
    Job responsesElement = Job.newBuilder().build();
    ListJobsResponse expectedResponse =
        ListJobsResponse.newBuilder()
            .setNextPageToken("")
            .addAllJobs(Arrays.asList(responsesElement))
            .build();
    mockBatchService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListJobsPagedResponse pagedListResponse = client.listJobs(parent);

    List<Job> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getJobsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListJobsRequest actualRequest = ((ListJobsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listJobsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listJobs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTaskTest() throws Exception {
    Task expectedResponse =
        Task.newBuilder()
            .setName(
                TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]")
                    .toString())
            .setStatus(TaskStatus.newBuilder().build())
            .build();
    mockBatchService.addResponse(expectedResponse);

    TaskName name = TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]");

    Task actualResponse = client.getTask(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTaskRequest actualRequest = ((GetTaskRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTaskExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      TaskName name = TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]");
      client.getTask(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTaskTest2() throws Exception {
    Task expectedResponse =
        Task.newBuilder()
            .setName(
                TaskName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]", "[TASK]")
                    .toString())
            .setStatus(TaskStatus.newBuilder().build())
            .build();
    mockBatchService.addResponse(expectedResponse);

    String name = "name3373707";

    Task actualResponse = client.getTask(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTaskRequest actualRequest = ((GetTaskRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTaskExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String name = "name3373707";
      client.getTask(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTasksTest() throws Exception {
    Task responsesElement = Task.newBuilder().build();
    ListTasksResponse expectedResponse =
        ListTasksResponse.newBuilder()
            .setNextPageToken("")
            .addAllTasks(Arrays.asList(responsesElement))
            .build();
    mockBatchService.addResponse(expectedResponse);

    TaskGroupName parent = TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]");

    ListTasksPagedResponse pagedListResponse = client.listTasks(parent);

    List<Task> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTasksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTasksRequest actualRequest = ((ListTasksRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTasksExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      TaskGroupName parent = TaskGroupName.of("[PROJECT]", "[LOCATION]", "[JOB]", "[TASK_GROUP]");
      client.listTasks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTasksTest2() throws Exception {
    Task responsesElement = Task.newBuilder().build();
    ListTasksResponse expectedResponse =
        ListTasksResponse.newBuilder()
            .setNextPageToken("")
            .addAllTasks(Arrays.asList(responsesElement))
            .build();
    mockBatchService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListTasksPagedResponse pagedListResponse = client.listTasks(parent);

    List<Task> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTasksList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTasksRequest actualRequest = ((ListTasksRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTasksExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listTasks(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
