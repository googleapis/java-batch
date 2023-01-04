// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public final class TaskProto {
  private TaskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_ComputeResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_StatusEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_TaskExecution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskExecution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_TaskStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Runnable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Runnable_Container_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Container_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Runnable_Script_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Script_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Barrier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_TaskSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_LifecyclePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Environment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/cloud/batch/v1/task.proto\022\025goog" +
      "le.cloud.batch.v1\032\031google/api/resource.p" +
      "roto\032\"google/cloud/batch/v1/volume.proto" +
      "\032\036google/protobuf/duration.proto\032\037google" +
      "/protobuf/timestamp.proto\"O\n\017ComputeReso" +
      "urce\022\021\n\tcpu_milli\030\001 \001(\003\022\022\n\nmemory_mib\030\002 " +
      "\001(\003\022\025\n\rboot_disk_mib\030\004 \001(\003\"\236\001\n\013StatusEve" +
      "nt\022\014\n\004type\030\003 \001(\t\022\023\n\013description\030\001 \001(\t\022.\n" +
      "\nevent_time\030\002 \001(\0132\032.google.protobuf.Time" +
      "stamp\022<\n\016task_execution\030\004 \001(\0132$.google.c" +
      "loud.batch.v1.TaskExecution\"\"\n\rTaskExecu" +
      "tion\022\021\n\texit_code\030\001 \001(\005\"\342\001\n\nTaskStatus\0226" +
      "\n\005state\030\001 \001(\0162\'.google.cloud.batch.v1.Ta" +
      "skStatus.State\0229\n\rstatus_events\030\002 \003(\0132\"." +
      "google.cloud.batch.v1.StatusEvent\"a\n\005Sta" +
      "te\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\014" +
      "\n\010ASSIGNED\020\002\022\013\n\007RUNNING\020\003\022\n\n\006FAILED\020\004\022\r\n" +
      "\tSUCCEEDED\020\005\"\362\004\n\010Runnable\022>\n\tcontainer\030\001" +
      " \001(\0132).google.cloud.batch.v1.Runnable.Co" +
      "ntainerH\000\0228\n\006script\030\002 \001(\0132&.google.cloud" +
      ".batch.v1.Runnable.ScriptH\000\022:\n\007barrier\030\006" +
      " \001(\0132\'.google.cloud.batch.v1.Runnable.Ba" +
      "rrierH\000\022\032\n\022ignore_exit_status\030\003 \001(\010\022\022\n\nb" +
      "ackground\030\004 \001(\010\022\022\n\nalways_run\030\005 \001(\010\0227\n\013e" +
      "nvironment\030\007 \001(\0132\".google.cloud.batch.v1" +
      ".Environment\022*\n\007timeout\030\010 \001(\0132\031.google.p" +
      "rotobuf.Duration\032\252\001\n\tContainer\022\021\n\timage_" +
      "uri\030\001 \001(\t\022\020\n\010commands\030\002 \003(\t\022\022\n\nentrypoin" +
      "t\030\003 \001(\t\022\017\n\007volumes\030\007 \003(\t\022\017\n\007options\030\010 \001(" +
      "\t\022\036\n\026block_external_network\030\t \001(\010\022\020\n\010use" +
      "rname\030\n \001(\t\022\020\n\010password\030\013 \001(\t\0323\n\006Script\022" +
      "\016\n\004path\030\001 \001(\tH\000\022\016\n\004text\030\002 \001(\tH\000B\t\n\007comma" +
      "nd\032\027\n\007Barrier\022\014\n\004name\030\001 \001(\tB\014\n\nexecutabl" +
      "e\"\375\003\n\010TaskSpec\0222\n\trunnables\030\010 \003(\0132\037.goog" +
      "le.cloud.batch.v1.Runnable\022@\n\020compute_re" +
      "source\030\003 \001(\0132&.google.cloud.batch.v1.Com" +
      "puteResource\0223\n\020max_run_duration\030\004 \001(\0132\031" +
      ".google.protobuf.Duration\022\027\n\017max_retry_c" +
      "ount\030\005 \001(\005\022B\n\022lifecycle_policies\030\t \003(\0132&" +
      ".google.cloud.batch.v1.LifecyclePolicy\022K" +
      "\n\014environments\030\006 \003(\01321.google.cloud.batc" +
      "h.v1.TaskSpec.EnvironmentsEntryB\002\030\001\022.\n\007v" +
      "olumes\030\007 \003(\0132\035.google.cloud.batch.v1.Vol" +
      "ume\0227\n\013environment\030\n \001(\0132\".google.cloud." +
      "batch.v1.Environment\0323\n\021EnvironmentsEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\212\002\n\017Li" +
      "fecyclePolicy\022=\n\006action\030\001 \001(\0162-.google.c" +
      "loud.batch.v1.LifecyclePolicy.Action\022P\n\020" +
      "action_condition\030\002 \001(\01326.google.cloud.ba" +
      "tch.v1.LifecyclePolicy.ActionCondition\032%" +
      "\n\017ActionCondition\022\022\n\nexit_codes\030\001 \003(\005\"?\n" +
      "\006Action\022\026\n\022ACTION_UNSPECIFIED\020\000\022\016\n\nRETRY" +
      "_TASK\020\001\022\r\n\tFAIL_TASK\020\002\"\300\001\n\004Task\022\014\n\004name\030" +
      "\001 \001(\t\0221\n\006status\030\002 \001(\0132!.google.cloud.bat" +
      "ch.v1.TaskStatus:w\352At\n\031batch.googleapis." +
      "com/Task\022Wprojects/{project}/locations/{" +
      "location}/jobs/{job}/taskGroups/{task_gr" +
      "oup}/tasks/{task}\"\217\003\n\013Environment\022D\n\tvar" +
      "iables\030\001 \003(\01321.google.cloud.batch.v1.Env" +
      "ironment.VariablesEntry\022Q\n\020secret_variab" +
      "les\030\002 \003(\01327.google.cloud.batch.v1.Enviro" +
      "nment.SecretVariablesEntry\022I\n\023encrypted_" +
      "variables\030\003 \001(\0132,.google.cloud.batch.v1." +
      "Environment.KMSEnvMap\0322\n\tKMSEnvMap\022\020\n\010ke" +
      "y_name\030\001 \001(\t\022\023\n\013cipher_text\030\002 \001(\t\0320\n\016Var" +
      "iablesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001\0326\n\024SecretVariablesEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t:\0028\001B\265\001\n\031com.google.cloud" +
      ".batch.v1B\tTaskProtoP\001Z:google.golang.or" +
      "g/genproto/googleapis/cloud/batch/v1;bat" +
      "ch\242\002\003GCB\252\002\025Google.Cloud.Batch.V1\312\002\025Googl" +
      "e\\Cloud\\Batch\\V1\352\002\030Google::Cloud::Batch:" +
      ":V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.batch.v1.VolumeProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_batch_v1_ComputeResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_ComputeResource_descriptor,
        new java.lang.String[] { "CpuMilli", "MemoryMib", "BootDiskMib", });
    internal_static_google_cloud_batch_v1_StatusEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1_StatusEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_StatusEvent_descriptor,
        new java.lang.String[] { "Type", "Description", "EventTime", "TaskExecution", });
    internal_static_google_cloud_batch_v1_TaskExecution_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1_TaskExecution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_TaskExecution_descriptor,
        new java.lang.String[] { "ExitCode", });
    internal_static_google_cloud_batch_v1_TaskStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_TaskStatus_descriptor,
        new java.lang.String[] { "State", "StatusEvents", });
    internal_static_google_cloud_batch_v1_Runnable_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1_Runnable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Runnable_descriptor,
        new java.lang.String[] { "Container", "Script", "Barrier", "IgnoreExitStatus", "Background", "AlwaysRun", "Environment", "Timeout", "Executable", });
    internal_static_google_cloud_batch_v1_Runnable_Container_descriptor =
      internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_Runnable_Container_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Runnable_Container_descriptor,
        new java.lang.String[] { "ImageUri", "Commands", "Entrypoint", "Volumes", "Options", "BlockExternalNetwork", "Username", "Password", });
    internal_static_google_cloud_batch_v1_Runnable_Script_descriptor =
      internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_Runnable_Script_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Runnable_Script_descriptor,
        new java.lang.String[] { "Path", "Text", "Command", });
    internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor =
      internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_Runnable_Barrier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_batch_v1_TaskSpec_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1_TaskSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_TaskSpec_descriptor,
        new java.lang.String[] { "Runnables", "ComputeResource", "MaxRunDuration", "MaxRetryCount", "LifecyclePolicies", "Environments", "Volumes", "Environment", });
    internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor =
      internal_static_google_cloud_batch_v1_TaskSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1_LifecyclePolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor,
        new java.lang.String[] { "Action", "ActionCondition", });
    internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor =
      internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor,
        new java.lang.String[] { "ExitCodes", });
    internal_static_google_cloud_batch_v1_Task_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Task_descriptor,
        new java.lang.String[] { "Name", "Status", });
    internal_static_google_cloud_batch_v1_Environment_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Environment_descriptor,
        new java.lang.String[] { "Variables", "SecretVariables", "EncryptedVariables", });
    internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor =
      internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor,
        new java.lang.String[] { "KeyName", "CipherText", });
    internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor =
      internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_Environment_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor =
      internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1.VolumeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
