package com.google.ar.core;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.exceptions.FatalException;
import defpackage.a;
import defpackage.rtl;
import defpackage.rtz;
import defpackage.rua;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final rtl faceCache;
    final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* compiled from: PG */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7),
        SHAREABLE_CAMERA(13),
        DEPTH_IMAGE_USES_GEO_FACADES(14);

        final int nativeCode;

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* compiled from: PG */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        final int nativeCode;

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        static FeatureMapQuality forNumber(int i) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            throw new FatalException(a.bv(i, "Unexpected value for native FeatureMapQuality, value="));
        }
    }

    protected Session() {
        this.faceCache = new rtl();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()) : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native String nativeCaptureMetadataGetEntryKeyName(long j, long j2, int i);

    private native Object nativeCaptureMetadataGetEntryObject(long j, long j2, int i);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private native long nativeCreateAugmentedRegion(long j, float[] fArr);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    private static native long nativeCreateSessionAndWrapperWithSettings(Context context, String str);

    private static native long nativeCreateSessionAndWrapperWithSettingsProto(Context context, byte[] bArr, String str);

    static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native void nativeEnableIncognitoMode(long j);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native int nativeGetCaptureMetadataEntryCount(long j, long j2);

    private native void nativeGetConfig(long j, long j2);

    private native void nativeGetDebugSessionIdLongs(long j, long[] jArr);

    private native int nativeGetFrameDelay(long j);

    private native long[] nativeGetHeldInjectedImageTimestamps(long j);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native long nativeGetRecommendedCaptureMetadata(long j, String str);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long[] nativeHostCloudAnchorAsync(long j, long j2, int i, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native void nativeInject(long j, long j2, int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, long j3, long j4, long[] jArr, float[] fArr, float[] fArr2, int i9);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeReleaseCaptureMetadata(long j, long j2);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j);

    private native void nativeSetAnalyticsPolicy(long j, String str);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    static void throwExceptionFromArStatus(int i) throws Exception {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        return ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d, double d2, Consumer consumer) {
        long[] jArrNativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d, d2, consumer != null ? new VpsAvailabilityFuture.CallbackWrapper(consumer) : null);
        return new VpsAvailabilityFuture(this, jArrNativeCheckVpsAvailabilityAsync[0], jArrNativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public List convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new TrackData(j, this));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Collection convertNativeTrackablesToCollection(Class cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable trackableCreateTrackable = createTrackable(j);
            if (trackableCreateTrackable != null) {
                arrayList.add((Trackable) cls.cast(trackableCreateTrackable));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public AugmentedRegion createAugmentedRegion(float[] fArr) {
        return new AugmentedRegion(nativeCreateAugmentedRegion(this.nativeWrapperHandle, fArr), this);
    }

    public Trackable createTrackable(long j) {
        rua ruaVar;
        int iInternalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        rua[] ruaVarArrValues = rua.values();
        int length = ruaVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ruaVar = null;
                break;
            }
            ruaVar = ruaVarArrValues[i];
            if (ruaVar.l == iInternalGetType) {
                break;
            }
            i++;
        }
        if (ruaVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
            return null;
        }
        switch (ruaVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j, this);
            case 3:
                return new Point(j, this);
            case 4:
                return new AugmentedImage(j, this);
            case 5:
                return this.faceCache.a(j, this);
            case 6:
                return new StreetscapeGeometry(j, this);
            case 7:
                return getEarth();
            case 8:
                return new DepthPoint(j, this);
            case 9:
                return new InstantPlacementPoint(j, this);
            case 10:
                return new MagicalSurfacePoint(j, this);
            default:
                throw null;
        }
    }

    public void enableIncognitoMode() {
        nativeEnableIncognitoMode(this.nativeWrapperHandle);
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    protected void finalize() throws Throwable {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public Collection getAllTrackables(Class cls) {
        rua ruaVarA = rua.a(cls);
        return ruaVarA == rua.UNKNOWN_TO_JAVA ? Collections.EMPTY_LIST : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, ruaVarA.l));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public List getCaptureMetadata(String str) {
        String str2 = Build.DEVICE;
        int i = Build.VERSION.SDK_INT;
        boolean zEquals = Build.DEVICE.equals("generic_x86");
        if (true == zEquals) {
            i = 33;
        }
        if (true == zEquals) {
            str2 = "oriole";
        }
        return CaptureMetadataEntry.getCaptureMetadataForPixelAndEmulatorDevices(str, str2, i);
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public UUID getDebugSessionId() {
        long[] jArr = new long[2];
        nativeGetDebugSessionIdLongs(this.nativeWrapperHandle, jArr);
        return new UUID(jArr[0], jArr[1]);
    }

    public Earth getEarth() {
        long jNativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (jNativeAcquireEarth != 0) {
            return new Earth(jNativeAcquireEarth, this);
        }
        return null;
    }

    public int getFrameDelay() {
        return nativeGetFrameDelay(this.nativeWrapperHandle);
    }

    public List getHeldInjectedImageTimestamps() {
        long[] jArrNativeGetHeldInjectedImageTimestamps = nativeGetHeldInjectedImageTimestamps(this.nativeWrapperHandle);
        ArrayList arrayList = new ArrayList();
        for (long j : jArrNativeGetHeldInjectedImageTimestamps) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public List getRecommendedCaptureMetadata(String str) {
        long jNativeGetRecommendedCaptureMetadata = nativeGetRecommendedCaptureMetadata(this.nativeWrapperHandle, str);
        if (jNativeGetRecommendedCaptureMetadata == 0) {
            return null;
        }
        int iNativeGetCaptureMetadataEntryCount = nativeGetCaptureMetadataEntryCount(this.nativeWrapperHandle, jNativeGetRecommendedCaptureMetadata);
        ArrayList arrayList = new ArrayList(iNativeGetCaptureMetadataEntryCount);
        int i = 0;
        while (i < iNativeGetCaptureMetadataEntryCount) {
            Session session = this;
            Object objNativeCaptureMetadataGetEntryObject = session.nativeCaptureMetadataGetEntryObject(this.nativeWrapperHandle, jNativeGetRecommendedCaptureMetadata, i);
            arrayList.add(new CaptureMetadataEntry(new CaptureRequest.Key(session.nativeCaptureMetadataGetEntryKeyName(session.nativeWrapperHandle, jNativeGetRecommendedCaptureMetadata, i), objNativeCaptureMetadataGetEntryObject.getClass()), objNativeCaptureMetadataGetEntryObject));
            i++;
            this = session;
        }
        Session session2 = this;
        session2.nativeReleaseCaptureMetadata(session2.nativeWrapperHandle, jNativeGetRecommendedCaptureMetadata);
        return arrayList;
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i, BiConsumer biConsumer) {
        long[] jArrNativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i, biConsumer != null ? new HostCloudAnchorFuture.CallbackWrapper(biConsumer) : null);
        return new HostCloudAnchorFuture(this, jArrNativeHostCloudAnchorAsync[0], jArrNativeHostCloudAnchorAsync[1]);
    }

    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public void inject(Image image, CaptureResult captureResult) {
        int i;
        long[] jArr;
        float[] fArr;
        float[] fArr2;
        OisSample[] oisSampleArr;
        int length;
        if (image.getFormat() != 35) {
            throw new IllegalArgumentException("Image must be in YUV_420_888 format.");
        }
        Image.Plane[] planes = image.getPlanes();
        int i2 = 0;
        Image.Plane plane = planes[0];
        Image.Plane plane2 = planes[1];
        Image.Plane plane3 = planes[2];
        long jLongValue = ((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)).longValue();
        long jLongValue2 = ((Long) captureResult.get(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW)).longValue();
        Integer num = (Integer) captureResult.get(CaptureResult.LENS_OPTICAL_STABILIZATION_MODE);
        if (num == null || num.intValue() != 1 || (oisSampleArr = (OisSample[]) captureResult.get(CaptureResult.STATISTICS_OIS_SAMPLES)) == null) {
            i = 0;
            jArr = null;
            fArr = null;
            fArr2 = null;
        } else {
            int length2 = oisSampleArr.length;
            long[] jArr2 = new long[length2];
            float[] fArr3 = new float[length2];
            float[] fArr4 = new float[length2];
            while (true) {
                length = oisSampleArr.length;
                if (i2 >= length) {
                    break;
                }
                jArr2[i2] = oisSampleArr[i2].getTimestamp();
                fArr3[i2] = oisSampleArr[i2].getXshift();
                fArr4[i2] = oisSampleArr[i2].getYshift();
                i2++;
            }
            fArr2 = fArr4;
            fArr = fArr3;
            jArr = jArr2;
            i = length;
        }
        nativeInject(this.nativeWrapperHandle, image.getTimestamp(), image.getWidth(), image.getHeight(), plane.getBuffer(), plane.getRowStride(), plane.getPixelStride(), plane2.getBuffer(), plane2.getRowStride(), plane2.getPixelStride(), plane3.getBuffer(), plane3.getRowStride(), plane3.getPixelStride(), jLongValue, jLongValue2, jArr, fArr, fArr2, i);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSegmentationModeSupported(Config.SegmentationMode segmentationMode) {
        return nativeIsSegmentationModeSupported(this.nativeWrapperHandle, segmentationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native long[] nativeCheckVpsAvailabilityAsync(long j, double d, double d2, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native boolean nativeIsImageStabilizationModeSupported(long j, int i);

    public native boolean nativeIsSegmentationModeSupported(long j, int i);

    public native boolean nativeIsSemanticModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public void requestModuleInstallDeferred(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
    }

    public void requestModuleInstallImmediate(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Module) it.next()).nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
    }

    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, BiConsumer biConsumer) {
        long[] jArrNativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, biConsumer != null ? new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer) : null);
        return new ResolveCloudAnchorFuture(this, jArrNativeResolveCloudAnchorAsync[0], jArrNativeResolveCloudAnchorAsync[1]);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setAnalyticsPolicy(String str) {
        nativeSetAnalyticsPolicy(this.nativeWrapperHandle, str);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    @Deprecated
    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig == null) {
            throw new IllegalArgumentException();
        }
        nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j) {
        this.faceCache = new rtl();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) throws Exception {
        int length;
        for (rtz rtzVar : rtz.values()) {
            if (rtzVar.G == i) {
                Class cls = rtzVar.H;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (length = strArr.length) != iArr.length) {
                    length = 0;
                }
                String str2 = rtzVar.I;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(null).newInstance(null));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) cls.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + length];
                int i2 = 0;
                while (i2 < length) {
                    stackTraceElementArr[i2] = new StackTraceElement("ARCore", "native", strArr[i2], iArr[i2]);
                    i2++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i2] = stackTraceElement;
                    i2++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        throw new FatalException("Unexpected error code: " + i);
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] jArrNativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(jArrNativeGetSupportedCameraConfigsWithFilter.length);
            for (long j : jArrNativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j));
            }
            return DesugarCollections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    @Deprecated
    public Session(Context context, String str) {
        this.faceCache = new rtl();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long jNativeCreateSessionAndWrapperWithSettings = nativeCreateSessionAndWrapperWithSettings(context, str);
        this.nativeWrapperHandle = jNativeCreateSessionAndWrapperWithSettings;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(jNativeCreateSessionAndWrapperWithSettings);
        if (str.contains("camera_stack,java")) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, Set set) {
        this.faceCache = new rtl();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Feature) it.next()).nativeCode;
            i++;
        }
        iArr[i] = 0;
        long jNativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = jNativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(jNativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public Session(Context context, byte[] bArr, String str, boolean z) {
        this.faceCache = new rtl();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        long jNativeCreateSessionAndWrapperWithSettingsProto = nativeCreateSessionAndWrapperWithSettingsProto(context, bArr, str);
        this.nativeWrapperHandle = jNativeCreateSessionAndWrapperWithSettingsProto;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(jNativeCreateSessionAndWrapperWithSettingsProto);
        if (z) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
