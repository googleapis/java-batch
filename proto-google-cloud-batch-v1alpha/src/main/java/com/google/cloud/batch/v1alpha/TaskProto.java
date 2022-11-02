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
// source: google/cloud/batch/v1alpha/task.proto

package com.google.cloud.batch.v1alpha;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ComputeResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Container_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Script_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/batch/v1alpha/task.proto\022"
          + "\032google.cloud.batch.v1alpha\032\031google/api/"
          + "resource.proto\032\'google/cloud/batch/v1alp"
          + "ha/volume.proto\032\036google/protobuf/duratio"
          + "n.proto\032\037google/protobuf/timestamp.proto"
          + "\"b\n\017ComputeResource\022\021\n\tcpu_milli\030\001 \001(\003\022\022"
          + "\n\nmemory_mib\030\002 \001(\003\022\021\n\tgpu_count\030\003 \001(\003\022\025\n"
          + "\rboot_disk_mib\030\004 \001(\003\"\243\001\n\013StatusEvent\022\014\n\004"
          + "type\030\003 \001(\t\022\023\n\013description\030\001 \001(\t\022.\n\nevent"
          + "_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022"
          + "A\n\016task_execution\030\004 \001(\0132).google.cloud.b"
          + "atch.v1alpha.TaskExecution\"\"\n\rTaskExecut"
          + "ion\022\021\n\texit_code\030\001 \001(\005\"\354\001\n\nTaskStatus\022;\n"
          + "\005state\030\001 \001(\0162,.google.cloud.batch.v1alph"
          + "a.TaskStatus.State\022>\n\rstatus_events\030\002 \003("
          + "\0132\'.google.cloud.batch.v1alpha.StatusEve"
          + "nt\"a\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PE"
          + "NDING\020\001\022\014\n\010ASSIGNED\020\002\022\013\n\007RUNNING\020\003\022\n\n\006FA"
          + "ILED\020\004\022\r\n\tSUCCEEDED\020\005\"\367\005\n\010Runnable\022C\n\tco"
          + "ntainer\030\001 \001(\0132..google.cloud.batch.v1alp"
          + "ha.Runnable.ContainerH\000\022=\n\006script\030\002 \001(\0132"
          + "+.google.cloud.batch.v1alpha.Runnable.Sc"
          + "riptH\000\022?\n\007barrier\030\006 \001(\0132,.google.cloud.b"
          + "atch.v1alpha.Runnable.BarrierH\000\022\032\n\022ignor"
          + "e_exit_status\030\003 \001(\010\022\022\n\nbackground\030\004 \001(\010\022"
          + "\022\n\nalways_run\030\005 \001(\010\022<\n\013environment\030\007 \001(\013"
          + "2\'.google.cloud.batch.v1alpha.Environmen"
          + "t\022*\n\007timeout\030\010 \001(\0132\031.google.protobuf.Dur"
          + "ation\022@\n\006labels\030\t \003(\01320.google.cloud.bat"
          + "ch.v1alpha.Runnable.LabelsEntry\032\252\001\n\tCont"
          + "ainer\022\021\n\timage_uri\030\001 \001(\t\022\020\n\010commands\030\002 \003"
          + "(\t\022\022\n\nentrypoint\030\003 \001(\t\022\017\n\007volumes\030\007 \003(\t\022"
          + "\017\n\007options\030\010 \001(\t\022\036\n\026block_external_netwo"
          + "rk\030\t \001(\010\022\020\n\010username\030\n \001(\t\022\020\n\010password\030\013"
          + " \001(\t\0323\n\006Script\022\016\n\004path\030\001 \001(\tH\000\022\016\n\004text\030\002"
          + " \001(\tH\000B\t\n\007command\032\027\n\007Barrier\022\014\n\004name\030\001 \001"
          + "(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001B\014\n\nexecutable\"\233\004\n\010TaskSpec\0227\n\t"
          + "runnables\030\010 \003(\0132$.google.cloud.batch.v1a"
          + "lpha.Runnable\022E\n\020compute_resource\030\003 \001(\0132"
          + "+.google.cloud.batch.v1alpha.ComputeReso"
          + "urce\0223\n\020max_run_duration\030\004 \001(\0132\031.google."
          + "protobuf.Duration\022\027\n\017max_retry_count\030\005 \001"
          + "(\005\022G\n\022lifecycle_policies\030\t \003(\0132+.google."
          + "cloud.batch.v1alpha.LifecyclePolicy\022P\n\014e"
          + "nvironments\030\006 \003(\01326.google.cloud.batch.v"
          + "1alpha.TaskSpec.EnvironmentsEntryB\002\030\001\0223\n"
          + "\007volumes\030\007 \003(\0132\".google.cloud.batch.v1al"
          + "pha.Volume\022<\n\013environment\030\n \001(\0132\'.google"
          + ".cloud.batch.v1alpha.Environment\0323\n\021Envi"
          + "ronmentsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"\224\002\n\017LifecyclePolicy\022B\n\006action\030\001 \001("
          + "\01622.google.cloud.batch.v1alpha.Lifecycle"
          + "Policy.Action\022U\n\020action_condition\030\002 \001(\0132"
          + ";.google.cloud.batch.v1alpha.LifecyclePo"
          + "licy.ActionCondition\032%\n\017ActionCondition\022"
          + "\022\n\nexit_codes\030\001 \003(\005\"?\n\006Action\022\026\n\022ACTION_"
          + "UNSPECIFIED\020\000\022\016\n\nRETRY_TASK\020\001\022\r\n\tFAIL_TA"
          + "SK\020\002\"\305\001\n\004Task\022\014\n\004name\030\001 \001(\t\0226\n\006status\030\002 "
          + "\001(\0132&.google.cloud.batch.v1alpha.TaskSta"
          + "tus:w\352At\n\031batch.googleapis.com/Task\022Wpro"
          + "jects/{project}/locations/{location}/job"
          + "s/{job}/taskGroups/{task_group}/tasks/{t"
          + "ask}\"\236\003\n\013Environment\022I\n\tvariables\030\001 \003(\0132"
          + "6.google.cloud.batch.v1alpha.Environment"
          + ".VariablesEntry\022V\n\020secret_variables\030\002 \003("
          + "\0132<.google.cloud.batch.v1alpha.Environme"
          + "nt.SecretVariablesEntry\022N\n\023encrypted_var"
          + "iables\030\003 \001(\01321.google.cloud.batch.v1alph"
          + "a.Environment.KMSEnvMap\0322\n\tKMSEnvMap\022\020\n\010"
          + "key_name\030\001 \001(\t\022\023\n\013cipher_text\030\002 \001(\t\0320\n\016V"
          + "ariablesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\0326\n\024SecretVariablesEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\316\001\n\036com.google.clo"
          + "ud.batch.v1alphaB\tTaskProtoP\001Z?google.go"
          + "lang.org/genproto/googleapis/cloud/batch"
          + "/v1alpha;batch\242\002\003GCB\252\002\032Google.Cloud.Batc"
          + "h.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1alpha\352\002"
          + "\035Google::Cloud::Batch::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.VolumeProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_ComputeResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ComputeResource_descriptor,
            new java.lang.String[] {
              "CpuMilli", "MemoryMib", "GpuCount", "BootDiskMib",
            });
    internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_StatusEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_StatusEvent_descriptor,
            new java.lang.String[] {
              "Type", "Description", "EventTime", "TaskExecution",
            });
    internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_TaskExecution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskExecution_descriptor,
            new java.lang.String[] {
              "ExitCode",
            });
    internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_TaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_Runnable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_descriptor,
            new java.lang.String[] {
              "Container",
              "Script",
              "Barrier",
              "IgnoreExitStatus",
              "Background",
              "AlwaysRun",
              "Environment",
              "Timeout",
              "Labels",
              "Executable",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Runnable_Container_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Container_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Commands",
              "Entrypoint",
              "Volumes",
              "Options",
              "BlockExternalNetwork",
              "Username",
              "Password",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_Runnable_Script_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Script_descriptor,
            new java.lang.String[] {
              "Path", "Text", "Command",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_Barrier_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Runnable_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Runnable_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_TaskSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor,
            new java.lang.String[] {
              "Runnables",
              "ComputeResource",
              "MaxRunDuration",
              "MaxRetryCount",
              "LifecyclePolicies",
              "Environments",
              "Volumes",
              "Environment",
            });
    internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_TaskSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskSpec_EnvironmentsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor,
            new java.lang.String[] {
              "Action", "ActionCondition",
            });
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor =
        internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LifecyclePolicy_ActionCondition_descriptor,
            new java.lang.String[] {
              "ExitCodes",
            });
    internal_static_google_cloud_batch_v1alpha_Task_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Task_descriptor,
            new java.lang.String[] {
              "Name", "Status",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1alpha_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_descriptor,
            new java.lang.String[] {
              "Variables", "SecretVariables", "EncryptedVariables",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_KMSEnvMap_descriptor,
            new java.lang.String[] {
              "KeyName", "CipherText",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_VariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Environment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Environment_SecretVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.VolumeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
