package defpackage;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Plane;
import com.google.ar.core.PlaybackStatus;
import com.google.ar.core.Point;
import com.google.ar.core.PointCloud;
import com.google.ar.core.Pose;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class foq implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ foq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.b) {
            case 0:
                return new fow(((Plane) ((fok) this.a).a).getCenterPose());
            case 1:
                return ezh.i(((Plane) ((fok) this.a).a).getTrackingState());
            case 2:
                Point.OrientationMode orientationMode = ((Point) ((fok) this.a).a).getOrientationMode();
                ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus = RecordingStatus.NONE;
                PlaybackStatus playbackStatus = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode2 = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason = TrackingFailureReason.NONE;
                TrackingState trackingState = TrackingState.TRACKING;
                Config.UpdateMode updateMode = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode = Config.DepthMode.DISABLED;
                int iOrdinal = orientationMode.ordinal();
                if (iOrdinal == 0) {
                    return fnn.INITIALIZED_TO_IDENTITY;
                }
                if (iOrdinal == 1) {
                    return fnn.ESTIMATED_SURFACE_NORMAL;
                }
                throw new RuntimeException(null, null);
            case 3:
                return ((PointCloud) this.a).getPoints();
            case 4:
                return Long.valueOf(((PointCloud) this.a).getTimestamp());
            case 5:
                return ((PointCloud) this.a).getIds();
            case 6:
                return Float.valueOf(((Pose) this.a).qy());
            case 7:
                return Float.valueOf(((Pose) this.a).qx());
            case 8:
                return ((Pose) ((fok) this.a).a).getTranslation();
            case 9:
                return ((Pose) this.a).getXAxis();
            case 10:
                return Float.valueOf(((Pose) this.a).qw());
            case 11:
                return Float.valueOf(((Pose) this.a).qz());
            case 12:
                return ((Pose) this.a).getYAxis();
            case 13:
                return Float.valueOf(((Pose) this.a).tx());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Float.valueOf(((Pose) this.a).tz());
            case 15:
                return new fow(((Pose) ((fok) this.a).a).inverse());
            case 16:
                return ((Pose) ((fok) this.a).a).getRotationQuaternion();
            case 17:
                return Float.valueOf(((Pose) this.a).ty());
            case 18:
                return ((Pose) this.a).getZAxis();
            case 19:
                return sbp.j(((Session) ((fok) this.a).a).getHeldInjectedImageTimestamps());
            default:
                return new fok(((Session) ((fok) this.a).a).getConfig());
        }
    }
}
