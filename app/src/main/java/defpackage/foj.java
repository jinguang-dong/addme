package defpackage;

import android.content.Context;
import com.google.ar.core.Anchor;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.Plane;
import com.google.ar.core.PlaybackStatus;
import com.google.ar.core.Point;
import com.google.ar.core.Pose;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.Track;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class foj implements Supplier {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ foj(fok fokVar, Object obj, int i) {
        this.c = i;
        this.b = fokVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v63, types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.function.Supplier
    public final Object get() {
        Class cls;
        switch (this.c) {
            case 0:
                ArCoreApk.Availability availabilityCheckAvailability = ((ArCoreApk) ((fok) this.b).a).checkAvailability((Context) this.a);
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
                Config.DepthMode depthMode = Config.DepthMode.DISABLED;
                switch (availabilityCheckAvailability.ordinal()) {
                    case 0:
                        return fnj.UNKNOWN_ERROR;
                    case 1:
                        return fnj.UNKNOWN_CHECKING;
                    case 2:
                        return fnj.UNKNOWN_TIMED_OUT;
                    case 3:
                        return fnj.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                    case 4:
                        return fnj.SUPPORTED_NOT_INSTALLED;
                    case 5:
                        return fnj.SUPPORTED_APK_TOO_OLD;
                    case 6:
                        return fnj.SUPPORTED_INSTALLED;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 1:
                return Boolean.valueOf(((Anchor) ((fok) this.a).a).equals(((fok) this.b).a));
            case 2:
                Object obj = ((fok) this.a).a;
                Object obj2 = this.b;
                return new foi(((DepthPoint) ((fok) obj2).a).createAnchor((Pose) obj), ((fol) obj2).b);
            case 3:
                Object obj3 = ((fok) this.a).a;
                Object obj4 = this.b;
                return new foi(((InstantPlacementPoint) ((fok) obj4).a).createAnchor((Pose) obj3), ((foo) obj4).b);
            case 4:
                Object obj5 = ((fok) this.a).a;
                Object obj6 = this.b;
                return new foi(((Plane) ((fok) obj6).a).createAnchor((Pose) obj5), ((fot) obj6).b);
            case 5:
                return Boolean.valueOf(((Plane) ((fok) this.b).a).isPoseInPolygon((Pose) ((fow) this.a).a));
            case 6:
                Object obj7 = ((fok) this.a).a;
                Object obj8 = this.b;
                return new foi(((Point) ((fok) obj8).a).createAnchor((Pose) obj7), ((fou) obj8).b);
            case 7:
                Object obj9 = this.b;
                return new foi(((Session) ((fok) obj9).a).createAnchor((Pose) ((fow) this.a).a), (foy) obj9);
            case 8:
                Object obj10 = this.a;
                Object obj11 = ((fok) obj10).a;
                Object obj12 = this.b;
                Session session = (Session) obj11;
                if (obj12.equals(fnm.class)) {
                    cls = Plane.class;
                } else if (obj12.equals(fno.class)) {
                    cls = Point.class;
                } else if (obj12.equals(fnk.class)) {
                    cls = DepthPoint.class;
                } else {
                    if (!obj12.equals(fnl.class)) {
                        throw new IllegalArgumentException("Unsupported trackable class ".concat(obj12.toString()));
                    }
                    cls = InstantPlacementPoint.class;
                }
                Stream map = Collection.EL.stream(session.getAllTrackables(cls)).map(new fiy(obj10, 6)).map(new fiy(fnr.class, 7));
                int i = sbp.d;
                return (sbp) map.collect(ryv.a);
            case 9:
                Object obj13 = this.a;
                ((Track) ((fok) obj13).a).setMimeType((String) this.b);
                return obj13;
            case 10:
                Object obj14 = this.a;
                ((Track) ((fok) obj14).a).setId((UUID) this.b);
                return obj14;
            case 11:
                Object obj15 = ((fok) this.a).a;
                Object obj16 = this.b;
                return new foi(((Trackable) ((fok) obj16).a).createAnchor((Pose) obj15), ((foz) obj16).b);
            default:
                smx smxVar = new smx((smy) this.a);
                return new smw(smxVar, Math.min(smxVar.c.estimateSize(), smxVar.d.estimateSize()), this.b);
        }
    }

    public /* synthetic */ foj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
