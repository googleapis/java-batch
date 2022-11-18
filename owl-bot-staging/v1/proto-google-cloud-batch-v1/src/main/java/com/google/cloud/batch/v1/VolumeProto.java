// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/volume.proto

package com.google.cloud.batch.v1;

public final class VolumeProto {
  private VolumeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_Volume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_NFS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_NFS_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_batch_v1_GCS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_GCS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/batch/v1/volume.proto\022\025go" +
      "ogle.cloud.batch.v1\"\252\001\n\006Volume\022)\n\003nfs\030\001 " +
      "\001(\0132\032.google.cloud.batch.v1.NFSH\000\022)\n\003gcs" +
      "\030\003 \001(\0132\032.google.cloud.batch.v1.GCSH\000\022\025\n\013" +
      "device_name\030\006 \001(\tH\000\022\022\n\nmount_path\030\004 \001(\t\022" +
      "\025\n\rmount_options\030\005 \003(\tB\010\n\006source\"*\n\003NFS\022" +
      "\016\n\006server\030\001 \001(\t\022\023\n\013remote_path\030\002 \001(\t\"\032\n\003" +
      "GCS\022\023\n\013remote_path\030\001 \001(\tB\267\001\n\031com.google." +
      "cloud.batch.v1B\013VolumeProtoP\001Z:google.go" +
      "lang.org/genproto/googleapis/cloud/batch" +
      "/v1;batch\242\002\003GCB\252\002\025Google.Cloud.Batch.V1\312" +
      "\002\025Google\\Cloud\\Batch\\V1\352\002\030Google::Cloud:" +
      ":Batch::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_batch_v1_Volume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1_Volume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_Volume_descriptor,
        new java.lang.String[] { "Nfs", "Gcs", "DeviceName", "MountPath", "MountOptions", "Source", });
    internal_static_google_cloud_batch_v1_NFS_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1_NFS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_NFS_descriptor,
        new java.lang.String[] { "Server", "RemotePath", });
    internal_static_google_cloud_batch_v1_GCS_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1_GCS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_batch_v1_GCS_descriptor,
        new java.lang.String[] { "RemotePath", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
