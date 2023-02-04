/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobDependency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobNotification_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ServiceAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/batch/v1alpha/job.proto\022\032"
          + "google.cloud.batch.v1alpha\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032%google/cloud/batch/v1alpha/task."
          + "proto\032\036google/protobuf/duration.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\323\007\n\003Job\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\022\020\n\010p"
          + "riority\030\003 \001(\003\022?\n\013task_groups\030\004 \003(\0132%.goo"
          + "gle.cloud.batch.v1alpha.TaskGroupB\003\340A\002\022K"
          + "\n\021scheduling_policy\030\005 \001(\01620.google.cloud"
          + ".batch.v1alpha.Job.SchedulingPolicy\022?\n\014d"
          + "ependencies\030\006 \003(\0132).google.cloud.batch.v"
          + "1alpha.JobDependency\022G\n\021allocation_polic"
          + "y\030\007 \001(\0132,.google.cloud.batch.v1alpha.All"
          + "ocationPolicy\022;\n\006labels\030\010 \003(\0132+.google.c"
          + "loud.batch.v1alpha.Job.LabelsEntry\022:\n\006st"
          + "atus\030\t \001(\0132%.google.cloud.batch.v1alpha."
          + "JobStatusB\003\340A\003\022E\n\014notification\030\n \001(\0132+.g"
          + "oogle.cloud.batch.v1alpha.JobNotificatio"
          + "nB\002\030\001\0224\n\013create_time\030\013 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\014 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022;\n\013log"
          + "s_policy\030\r \001(\0132&.google.cloud.batch.v1al"
          + "pha.LogsPolicy\022B\n\rnotifications\030\016 \003(\0132+."
          + "google.cloud.batch.v1alpha.JobNotificati"
          + "on\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"N\n\020SchedulingPolicy\022!\n\035SCHEDUL"
          + "ING_POLICY_UNSPECIFIED\020\000\022\027\n\023AS_SOON_AS_P"
          + "OSSIBLE\020\001:Q\352AN\n\030batch.googleapis.com/Job"
          + "\0222projects/{project}/locations/{location"
          + "}/jobs/{job}\"\261\001\n\nLogsPolicy\022G\n\013destinati"
          + "on\030\001 \001(\01622.google.cloud.batch.v1alpha.Lo"
          + "gsPolicy.Destination\022\021\n\tlogs_path\030\002 \001(\t\""
          + "G\n\013Destination\022\033\n\027DESTINATION_UNSPECIFIE"
          + "D\020\000\022\021\n\rCLOUD_LOGGING\020\001\022\010\n\004PATH\020\002\"\371\001\n\rJob"
          + "Dependency\022C\n\005items\030\001 \003(\01324.google.cloud"
          + ".batch.v1alpha.JobDependency.ItemsEntry\032"
          + "\\\n\nItemsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001("
          + "\0162..google.cloud.batch.v1alpha.JobDepend"
          + "ency.Type:\0028\001\"E\n\004Type\022\024\n\020TYPE_UNSPECIFIE"
          + "D\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002\022\014\n\010FINISH"
          + "ED\020\003\"\250\007\n\tJobStatus\022:\n\005state\030\001 \001(\0162+.goog"
          + "le.cloud.batch.v1alpha.JobStatus.State\022>"
          + "\n\rstatus_events\030\002 \003(\0132\'.google.cloud.bat"
          + "ch.v1alpha.StatusEvent\022J\n\013task_groups\030\004 "
          + "\003(\01325.google.cloud.batch.v1alpha.JobStat"
          + "us.TaskGroupsEntry\022/\n\014run_duration\030\005 \001(\013"
          + "2\031.google.protobuf.Duration\032\333\001\n\016Instance"
          + "Status\022\024\n\014machine_type\030\001 \001(\t\022Z\n\022provisio"
          + "ning_model\030\002 \001(\0162>.google.cloud.batch.v1"
          + "alpha.AllocationPolicy.ProvisioningModel"
          + "\022\021\n\ttask_pack\030\003 \001(\003\022D\n\tboot_disk\030\004 \001(\01321"
          + ".google.cloud.batch.v1alpha.AllocationPo"
          + "licy.Disk\032\334\001\n\017TaskGroupStatus\022Q\n\006counts\030"
          + "\001 \003(\0132A.google.cloud.batch.v1alpha.JobSt"
          + "atus.TaskGroupStatus.CountsEntry\022G\n\tinst"
          + "ances\030\002 \003(\01324.google.cloud.batch.v1alpha"
          + ".JobStatus.InstanceStatus\032-\n\013CountsEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\003:\0028\001\032h\n\017Task"
          + "GroupsEntry\022\013\n\003key\030\001 \001(\t\022D\n\005value\030\002 \001(\0132"
          + "5.google.cloud.batch.v1alpha.JobStatus.T"
          + "askGroupStatus:\0028\001\"{\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\n\n\006QUEUED\020\001\022\r\n\tSCHEDULED\020\002\022\013\n"
          + "\007RUNNING\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005\022\030\n"
          + "\024DELETION_IN_PROGRESS\020\006\"\220\003\n\017JobNotificat"
          + "ion\022\024\n\014pubsub_topic\030\001 \001(\t\022D\n\007message\030\002 \001"
          + "(\01323.google.cloud.batch.v1alpha.JobNotif"
          + "ication.Message\032\323\001\n\007Message\022>\n\004type\030\001 \001("
          + "\01620.google.cloud.batch.v1alpha.JobNotifi"
          + "cation.Type\022B\n\rnew_job_state\030\002 \001(\0162+.goo"
          + "gle.cloud.batch.v1alpha.JobStatus.State\022"
          + "D\n\016new_task_state\030\003 \001(\0162,.google.cloud.b"
          + "atch.v1alpha.TaskStatus.State\"K\n\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\025\n\021JOB_STATE_CHANGED"
          + "\020\001\022\026\n\022TASK_STATE_CHANGED\020\002\"\355\017\n\020Allocatio"
          + "nPolicy\022M\n\010location\030\001 \001(\0132;.google.cloud"
          + ".batch.v1alpha.AllocationPolicy.Location"
          + "Policy\022Q\n\010instance\030\002 \001(\0132;.google.cloud."
          + "batch.v1alpha.AllocationPolicy.InstanceP"
          + "olicyB\002\030\001\022X\n\tinstances\030\010 \003(\0132E.google.cl"
          + "oud.batch.v1alpha.AllocationPolicy.Insta"
          + "ncePolicyOrTemplate\022\036\n\022instance_template"
          + "s\030\003 \003(\tB\002\030\001\022_\n\023provisioning_models\030\004 \003(\016"
          + "2>.google.cloud.batch.v1alpha.Allocation"
          + "Policy.ProvisioningModelB\002\030\001\022!\n\025service_"
          + "account_email\030\005 \001(\tB\002\030\001\022C\n\017service_accou"
          + "nt\030\t \001(\0132*.google.cloud.batch.v1alpha.Se"
          + "rviceAccount\022H\n\006labels\030\006 \003(\01328.google.cl"
          + "oud.batch.v1alpha.AllocationPolicy.Label"
          + "sEntry\022K\n\007network\030\007 \001(\0132:.google.cloud.b"
          + "atch.v1alpha.AllocationPolicy.NetworkPol"
          + "icy\032E\n\016LocationPolicy\022\031\n\021allowed_locatio"
          + "ns\030\001 \003(\t\022\030\n\020denied_locations\030\002 \003(\t\032q\n\004Di"
          + "sk\022\017\n\005image\030\004 \001(\tH\000\022\022\n\010snapshot\030\005 \001(\tH\000\022"
          + "\014\n\004type\030\001 \001(\t\022\017\n\007size_gb\030\002 \001(\003\022\026\n\016disk_i"
          + "nterface\030\006 \001(\tB\r\n\013data_source\032\217\001\n\014Attach"
          + "edDisk\022E\n\010new_disk\030\001 \001(\01321.google.cloud."
          + "batch.v1alpha.AllocationPolicy.DiskH\000\022\027\n"
          + "\rexisting_disk\030\002 \001(\tH\000\022\023\n\013device_name\030\003 "
          + "\001(\tB\n\n\010attached\032K\n\013Accelerator\022\014\n\004type\030\001"
          + " \001(\t\022\r\n\005count\030\002 \001(\003\022\037\n\023install_gpu_drive"
          + "rs\030\003 \001(\010B\002\030\001\032\264\003\n\016InstancePolicy\022!\n\025allow"
          + "ed_machine_types\030\001 \003(\tB\002\030\001\022\024\n\014machine_ty"
          + "pe\030\002 \001(\t\022\030\n\020min_cpu_platform\030\003 \001(\t\022Z\n\022pr"
          + "ovisioning_model\030\004 \001(\0162>.google.cloud.ba"
          + "tch.v1alpha.AllocationPolicy.Provisionin"
          + "gModel\022N\n\014accelerators\030\005 \003(\01328.google.cl"
          + "oud.batch.v1alpha.AllocationPolicy.Accel"
          + "erator\022D\n\tboot_disk\030\010 \001(\01321.google.cloud"
          + ".batch.v1alpha.AllocationPolicy.Disk\022H\n\005"
          + "disks\030\006 \003(\01329.google.cloud.batch.v1alpha"
          + ".AllocationPolicy.AttachedDisk\022\023\n\013reserv"
          + "ation\030\007 \001(\t\032\266\001\n\030InstancePolicyOrTemplate"
          + "\022M\n\006policy\030\001 \001(\0132;.google.cloud.batch.v1"
          + "alpha.AllocationPolicy.InstancePolicyH\000\022"
          + "\033\n\021instance_template\030\002 \001(\tH\000\022\033\n\023install_"
          + "gpu_drivers\030\003 \001(\010B\021\n\017policy_template\032W\n\020"
          + "NetworkInterface\022\017\n\007network\030\001 \001(\t\022\022\n\nsub"
          + "network\030\002 \001(\t\022\036\n\026no_external_ip_address\030"
          + "\003 \001(\010\032j\n\rNetworkPolicy\022Y\n\022network_interf"
          + "aces\030\001 \003(\0132=.google.cloud.batch.v1alpha."
          + "AllocationPolicy.NetworkInterface\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"`\n\021ProvisioningModel\022\"\n\036PROVISIONING_MO"
          + "DEL_UNSPECIFIED\020\000\022\014\n\010STANDARD\020\001\022\010\n\004SPOT\020"
          + "\002\022\017\n\013PREEMPTIBLE\020\003\"\351\005\n\tTaskGroup\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\003\022<\n\ttask_spec\030\003 \001(\0132$.google."
          + "cloud.batch.v1alpha.TaskSpecB\003\340A\002\022\022\n\ntas"
          + "k_count\030\004 \001(\003\022\023\n\013parallelism\030\005 \001(\003\022Q\n\021sc"
          + "heduling_policy\030\006 \001(\01626.google.cloud.bat"
          + "ch.v1alpha.TaskGroup.SchedulingPolicy\022G\n"
          + "\021allocation_policy\030\007 \001(\0132,.google.cloud."
          + "batch.v1alpha.AllocationPolicy\022A\n\006labels"
          + "\030\010 \003(\01321.google.cloud.batch.v1alpha.Task"
          + "Group.LabelsEntry\022B\n\021task_environments\030\t"
          + " \003(\0132\'.google.cloud.batch.v1alpha.Enviro"
          + "nment\022\033\n\023task_count_per_node\030\n \001(\003\022\032\n\022re"
          + "quire_hosts_file\030\013 \001(\010\022\026\n\016permissive_ssh"
          + "\030\014 \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001\"N\n\020SchedulingPolicy\022!\n\035SCH"
          + "EDULING_POLICY_UNSPECIFIED\020\000\022\027\n\023AS_SOON_"
          + "AS_POSSIBLE\020\001:o\352Al\n\036batch.googleapis.com"
          + "/TaskGroup\022Jprojects/{project}/locations"
          + "/{location}/jobs/{job}/taskGroups/{task_"
          + "group}\"/\n\016ServiceAccount\022\r\n\005email\030\001 \001(\t\022"
          + "\016\n\006scopes\030\002 \003(\tB\302\001\n\036com.google.cloud.bat"
          + "ch.v1alphaB\010JobProtoP\001Z4cloud.google.com"
          + "/go/batch/apiv1alpha/batchpb;batchpb\242\002\003G"
          + "CB\252\002\032Google.Cloud.Batch.V1Alpha\312\002\032Google"
          + "\\Cloud\\Batch\\V1alpha\352\002\035Google::Cloud::Ba"
          + "tch::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.TaskProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Priority",
              "TaskGroups",
              "SchedulingPolicy",
              "Dependencies",
              "AllocationPolicy",
              "Labels",
              "Status",
              "Notification",
              "CreateTime",
              "UpdateTime",
              "LogsPolicy",
              "Notifications",
            });
    internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor,
            new java.lang.String[] {
              "Destination", "LogsPath",
            });
    internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_JobDependency_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor,
            new java.lang.String[] {
              "Items",
            });
    internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_JobStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents", "TaskGroups", "RunDuration",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor,
            new java.lang.String[] {
              "MachineType", "ProvisioningModel", "TaskPack", "BootDisk",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor,
            new java.lang.String[] {
              "Counts", "Instances",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_JobNotification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor,
            new java.lang.String[] {
              "PubsubTopic", "Message",
            });
    internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_JobNotification_Message_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor,
            new java.lang.String[] {
              "Type", "NewJobState", "NewTaskState",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor,
            new java.lang.String[] {
              "Location",
              "Instance",
              "Instances",
              "InstanceTemplates",
              "ProvisioningModels",
              "ServiceAccountEmail",
              "ServiceAccount",
              "Labels",
              "Network",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor,
            new java.lang.String[] {
              "AllowedLocations", "DeniedLocations",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor,
            new java.lang.String[] {
              "Image", "Snapshot", "Type", "SizeGb", "DiskInterface", "DataSource",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor,
            new java.lang.String[] {
              "NewDisk", "ExistingDisk", "DeviceName", "Attached",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor,
            new java.lang.String[] {
              "Type", "Count", "InstallGpuDrivers",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor,
            new java.lang.String[] {
              "AllowedMachineTypes",
              "MachineType",
              "MinCpuPlatform",
              "ProvisioningModel",
              "Accelerators",
              "BootDisk",
              "Disks",
              "Reservation",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor,
            new java.lang.String[] {
              "Policy", "InstanceTemplate", "InstallGpuDrivers", "PolicyTemplate",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor,
            new java.lang.String[] {
              "Network", "Subnetwork", "NoExternalIpAddress",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor,
            new java.lang.String[] {
              "NetworkInterfaces",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(8);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_TaskGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor,
            new java.lang.String[] {
              "Name",
              "TaskSpec",
              "TaskCount",
              "Parallelism",
              "SchedulingPolicy",
              "AllocationPolicy",
              "Labels",
              "TaskEnvironments",
              "TaskCountPerNode",
              "RequireHostsFile",
              "PermissiveSsh",
            });
    internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_ServiceAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor,
            new java.lang.String[] {
              "Email", "Scopes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.TaskProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
