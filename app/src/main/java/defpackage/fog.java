package defpackage;

import com.google.ar.core.Anchor;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraIntrinsics;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.core.PlaybackStatus;
import com.google.ar.core.Point;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fog implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fog(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((Anchor) this.a).hashCode());
            case 1:
                return Boolean.valueOf(!((fje) this.a).k);
            case 2:
                return new fow(((Anchor) ((fok) this.a).a).getPose());
            case 3:
                return ezh.i(((Anchor) ((fok) this.a).a).getTrackingState());
            case 4:
                return new fow(((Camera) ((fok) this.a).a).getPose());
            case 5:
                return new fok(((Camera) ((fok) this.a).a).getImageIntrinsics());
            case 6:
                return new fow(((Camera) ((fok) this.a).a).getDisplayOrientedPose());
            case 7:
                TrackingFailureReason trackingFailureReason = ((Camera) ((fok) this.a).a).getTrackingFailureReason();
                ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus = RecordingStatus.NONE;
                PlaybackStatus playbackStatus = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason2 = TrackingFailureReason.NONE;
                TrackingState trackingState = TrackingState.TRACKING;
                Config.UpdateMode updateMode = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode = Config.DepthMode.DISABLED;
                int iOrdinal = trackingFailureReason.ordinal();
                if (iOrdinal == 0) {
                    return fns.NONE;
                }
                if (iOrdinal == 1) {
                    return fns.BAD_STATE;
                }
                if (iOrdinal == 2) {
                    return fns.INSUFFICIENT_LIGHT;
                }
                if (iOrdinal == 3) {
                    return fns.EXCESSIVE_MOTION;
                }
                if (iOrdinal == 4) {
                    return fns.INSUFFICIENT_FEATURES;
                }
                if (iOrdinal == 5) {
                    return fns.CAMERA_UNAVAILABLE;
                }
                throw new RuntimeException(null, null);
            case 8:
                return ezh.i(((Camera) ((fok) this.a).a).getTrackingState());
            case 9:
                return ((CameraIntrinsics) ((fok) this.a).a).getPrincipalPoint();
            case 10:
                return ((CameraIntrinsics) ((fok) this.a).a).getFocalLength();
            case 11:
                return ((CameraIntrinsics) ((fok) this.a).a).getImageDimensions();
            case 12:
                return ((Config) this.a).getDepthMode();
            case 13:
                Config config = (Config) ((fok) this.a).a;
                ArCoreApk.InstallStatus installStatus2 = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability2 = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus2 = RecordingStatus.NONE;
                PlaybackStatus playbackStatus2 = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode2 = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d2 = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason3 = TrackingFailureReason.NONE;
                TrackingState trackingState2 = TrackingState.TRACKING;
                Config.UpdateMode updateMode2 = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode2 = Config.InstantPlacementMode.DISABLED;
                return config.setDepthMode(Config.DepthMode.DISABLED);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj = this.a;
                Config config2 = (Config) ((fok) obj).a;
                ArCoreApk.InstallStatus installStatus3 = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability3 = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus3 = RecordingStatus.NONE;
                PlaybackStatus playbackStatus3 = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode3 = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d3 = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason4 = TrackingFailureReason.NONE;
                TrackingState trackingState3 = TrackingState.TRACKING;
                Config.UpdateMode updateMode3 = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode3 = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode2 = Config.DepthMode.DISABLED;
                config2.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE_WITHOUT_OPENGL);
                return obj;
            case 15:
                Object obj2 = this.a;
                Config config3 = (Config) ((fok) obj2).a;
                ArCoreApk.InstallStatus installStatus4 = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability4 = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus4 = RecordingStatus.NONE;
                PlaybackStatus playbackStatus4 = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode4 = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d4 = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason5 = TrackingFailureReason.NONE;
                TrackingState trackingState4 = TrackingState.TRACKING;
                Config.UpdateMode updateMode4 = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode4 = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode3 = Config.DepthMode.DISABLED;
                config3.setInstantPlacementMode(Config.InstantPlacementMode.DISABLED);
                return obj2;
            case 16:
                return new fok(((Frame) ((fok) this.a).a).getCamera());
            case 17:
                return new fov(((Frame) ((fok) this.a).a).acquirePointCloud());
            case 18:
                return new fow(((HitResult) ((fok) this.a).a).getHitPose());
            case 19:
                Object obj3 = this.a;
                return new foz(((HitResult) ((fok) obj3).a).getTrackable(), ((fon) obj3).b);
            default:
                Object obj4 = this.a;
                Plane subsumedBy = ((Plane) ((fok) obj4).a).getSubsumedBy();
                if (subsumedBy == null) {
                    return null;
                }
                return new fot(subsumedBy, ((fot) obj4).b);
        }
    }
}
