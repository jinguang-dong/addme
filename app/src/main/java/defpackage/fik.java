package defpackage;

import android.os.VibrationEffect;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.PlaybackStatus;
import com.google.ar.core.Point;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.Track;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import j$.util.function.Function$CC;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fik implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ fik(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((lss) obj).o();
            case 1:
                return Integer.valueOf(fkn.a(((Float) obj).floatValue()));
            case 2:
                return ((mdm) obj).a();
            case 3:
                return ((fjk) obj).e;
            case 4:
                Config config = (Config) ((foy) obj).d().a;
                config.getClass();
                Config.DepthMode depthMode = (Config.DepthMode) ezh.k(new fog(config, 12));
                ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus = RecordingStatus.NONE;
                PlaybackStatus playbackStatus = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason = TrackingFailureReason.NONE;
                TrackingState trackingState = TrackingState.TRACKING;
                Config.UpdateMode updateMode = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode2 = Config.DepthMode.DISABLED;
                int iOrdinal = depthMode.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                        throw new RuntimeException(null, null);
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return ((tfd) obj).a;
            case 6:
                return Float.valueOf(((tfd) obj).b);
            case 7:
                return Boolean.valueOf(((tfc) obj) == tfc.NONE);
            case 8:
                tfc tfcVar = (tfc) obj;
                VibrationEffect vibrationEffect = fks.a;
                return tfcVar;
            case 9:
                VibrationEffect vibrationEffect2 = fks.a;
                return Boolean.valueOf(!((tfc) obj).equals(tfc.NONE));
            case 10:
                VibrationEffect vibrationEffect3 = fks.a;
                return Boolean.valueOf(((tfc) obj).equals(tfc.NONE));
            case 11:
                return Boolean.valueOf(((tfd) obj).a == tfc.NONE);
            case 12:
                return Float.valueOf(((tfd) obj).b);
            case 13:
                fnm fnmVar = (fnm) obj;
                float[] fArr = fld.a;
                return fnmVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((fmk) obj).a;
            case 15:
                return new fok(new Track((Session) ((foy) obj).a));
            case 16:
                return new fok(new RecordingConfig((Session) ((foy) obj).a));
            case 17:
                ArCoreApk.InstallStatus installStatus2 = ArCoreApk.InstallStatus.INSTALLED;
                ArCoreApk.Availability availability2 = ArCoreApk.Availability.UNKNOWN_ERROR;
                RecordingStatus recordingStatus2 = RecordingStatus.NONE;
                PlaybackStatus playbackStatus2 = PlaybackStatus.NONE;
                Point.OrientationMode orientationMode2 = Point.OrientationMode.INITIALIZED_TO_IDENTITY;
                Coordinates2d coordinates2d2 = Coordinates2d.TEXTURE_TEXELS;
                TrackingFailureReason trackingFailureReason2 = TrackingFailureReason.NONE;
                TrackingState trackingState2 = TrackingState.TRACKING;
                Config.UpdateMode updateMode2 = Config.UpdateMode.BLOCKING;
                Config.InstantPlacementMode instantPlacementMode2 = Config.InstantPlacementMode.DISABLED;
                Config.DepthMode depthMode3 = Config.DepthMode.DISABLED;
                switch (((fnq) obj).ordinal()) {
                    case 0:
                        return Session.Feature.FRONT_CAMERA;
                    case 1:
                        return Session.Feature.SHARED_CAMERA;
                    case 2:
                        return Session.Feature.DO_NOT_USE_ACTIVE_DEPTH_SENSOR;
                    case 3:
                        return Session.Feature.MOTION_TRACKING_ODOMETRY;
                    case 4:
                        return Session.Feature.HIT_TEST_WITH_DEPTH;
                    case 5:
                        return Session.Feature.SHAREABLE_CAMERA;
                    case 6:
                        return Session.Feature.DEPTH_IMAGE_USES_GEO_FACADES;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 18:
                return ((fps) obj).a < 40 ? fpq.TOO_FEW_LANDMARKS : fpq.LANDMARKS_TOO_FAR;
            case 19:
                return lty.b((oxj) obj);
            default:
                return (lty) ((rwc) obj).c();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
