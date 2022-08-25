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
// source: google/cloud/batch/v1alpha/volume.proto

package com.google.cloud.batch.v1alpha;

public interface VolumeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An NFS source for the volume (could be a Filestore, for example).
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.NFS nfs = 1;</code>
   *
   * @return Whether the nfs field is set.
   */
  boolean hasNfs();
  /**
   *
   *
   * <pre>
   * An NFS source for the volume (could be a Filestore, for example).
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.NFS nfs = 1;</code>
   *
   * @return The nfs.
   */
  com.google.cloud.batch.v1alpha.NFS getNfs();
  /**
   *
   *
   * <pre>
   * An NFS source for the volume (could be a Filestore, for example).
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.NFS nfs = 1;</code>
   */
  com.google.cloud.batch.v1alpha.NFSOrBuilder getNfsOrBuilder();

  /**
   *
   *
   * <pre>
   * A persistent disk source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.PD pd = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.Volume.pd is deprecated. See
   *     google/cloud/batch/v1alpha/volume.proto;l=37
   * @return Whether the pd field is set.
   */
  @java.lang.Deprecated
  boolean hasPd();
  /**
   *
   *
   * <pre>
   * A persistent disk source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.PD pd = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.batch.v1alpha.Volume.pd is deprecated. See
   *     google/cloud/batch/v1alpha/volume.proto;l=37
   * @return The pd.
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.PD getPd();
  /**
   *
   *
   * <pre>
   * A persistent disk source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.PD pd = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.batch.v1alpha.PDOrBuilder getPdOrBuilder();

  /**
   *
   *
   * <pre>
   * A Google Cloud Storage source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.GCS gcs = 3;</code>
   *
   * @return Whether the gcs field is set.
   */
  boolean hasGcs();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.GCS gcs = 3;</code>
   *
   * @return The gcs.
   */
  com.google.cloud.batch.v1alpha.GCS getGcs();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage source for the volume.
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.GCS gcs = 3;</code>
   */
  com.google.cloud.batch.v1alpha.GCSOrBuilder getGcsOrBuilder();

  /**
   *
   *
   * <pre>
   * Device name of an attached disk
   * </pre>
   *
   * <code>string device_name = 6;</code>
   *
   * @return Whether the deviceName field is set.
   */
  boolean hasDeviceName();
  /**
   *
   *
   * <pre>
   * Device name of an attached disk
   * </pre>
   *
   * <code>string device_name = 6;</code>
   *
   * @return The deviceName.
   */
  java.lang.String getDeviceName();
  /**
   *
   *
   * <pre>
   * Device name of an attached disk
   * </pre>
   *
   * <code>string device_name = 6;</code>
   *
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString getDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * Mount path for the volume, e.g. /mnt/share
   * </pre>
   *
   * <code>string mount_path = 4;</code>
   *
   * @return The mountPath.
   */
  java.lang.String getMountPath();
  /**
   *
   *
   * <pre>
   * Mount path for the volume, e.g. /mnt/share
   * </pre>
   *
   * <code>string mount_path = 4;</code>
   *
   * @return The bytes for mountPath.
   */
  com.google.protobuf.ByteString getMountPathBytes();

  /**
   *
   *
   * <pre>
   * Mount options
   * For Google Cloud Storage, mount options are the global options supported by
   * gcsfuse tool. Batch will use them to mount the volume with the following
   * command:
   * "gcsfuse [global options] bucket mountpoint".
   * For PD, NFS, mount options are these supported by /etc/fstab. Batch will
   * use Fstab to mount such volumes.
   * https://help.ubuntu.com/community/Fstab
   * </pre>
   *
   * <code>repeated string mount_options = 5;</code>
   *
   * @return A list containing the mountOptions.
   */
  java.util.List<java.lang.String> getMountOptionsList();
  /**
   *
   *
   * <pre>
   * Mount options
   * For Google Cloud Storage, mount options are the global options supported by
   * gcsfuse tool. Batch will use them to mount the volume with the following
   * command:
   * "gcsfuse [global options] bucket mountpoint".
   * For PD, NFS, mount options are these supported by /etc/fstab. Batch will
   * use Fstab to mount such volumes.
   * https://help.ubuntu.com/community/Fstab
   * </pre>
   *
   * <code>repeated string mount_options = 5;</code>
   *
   * @return The count of mountOptions.
   */
  int getMountOptionsCount();
  /**
   *
   *
   * <pre>
   * Mount options
   * For Google Cloud Storage, mount options are the global options supported by
   * gcsfuse tool. Batch will use them to mount the volume with the following
   * command:
   * "gcsfuse [global options] bucket mountpoint".
   * For PD, NFS, mount options are these supported by /etc/fstab. Batch will
   * use Fstab to mount such volumes.
   * https://help.ubuntu.com/community/Fstab
   * </pre>
   *
   * <code>repeated string mount_options = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The mountOptions at the given index.
   */
  java.lang.String getMountOptions(int index);
  /**
   *
   *
   * <pre>
   * Mount options
   * For Google Cloud Storage, mount options are the global options supported by
   * gcsfuse tool. Batch will use them to mount the volume with the following
   * command:
   * "gcsfuse [global options] bucket mountpoint".
   * For PD, NFS, mount options are these supported by /etc/fstab. Batch will
   * use Fstab to mount such volumes.
   * https://help.ubuntu.com/community/Fstab
   * </pre>
   *
   * <code>repeated string mount_options = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the mountOptions at the given index.
   */
  com.google.protobuf.ByteString getMountOptionsBytes(int index);

  public com.google.cloud.batch.v1alpha.Volume.SourceCase getSourceCase();
}