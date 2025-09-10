package defpackage;

import android.database.Cursor;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.HitResult;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.Trackable;
import j$.util.function.Function$CC;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fiy implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fiy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r4v74, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r4v77, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, qin] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                fnp fnpVar = (fnp) obj;
                fnp fnpVarDN = ((fon) this.a).f().dN();
                float fE = fnpVar.e() - fnpVarDN.e();
                float f = fnpVar.f() - fnpVarDN.f();
                float fG = fnpVar.g() - fnpVarDN.g();
                return Float.valueOf((fE * fE) + (f * f) + (fG * fG));
            case 1:
                return this.a.a(obj);
            case 2:
                return (fko) ((kfb) obj).a(this.a);
            case 3:
                return (nan) ((sbv) this.a).get((tfc) obj);
            case 4:
                float[] fArr = fld.a;
                fnp fnpVarD = ((fnm) obj).d();
                fnp fnpVarP = ((fon) this.a).f().p();
                float[] fArr2 = new float[3];
                float fE2 = fnpVarP.e();
                float f2 = fnpVarP.f();
                float fG2 = fnpVarP.g();
                fnpVarD.n(fArr2);
                return Float.valueOf(((fE2 - fnpVarD.e()) * fArr2[0]) + ((f2 - fnpVarD.f()) * fArr2[1]) + ((fG2 - fnpVarD.g()) * fArr2[2]));
            case 5:
                return new fon((HitResult) obj, ((fon) this.a).b);
            case 6:
                Trackable trackable = (Trackable) obj;
                boolean z = trackable instanceof Plane;
                Object obj2 = this.a;
                if (z) {
                    return new fot((Plane) trackable, (foy) obj2);
                }
                if (trackable instanceof Point) {
                    return new fou((Point) trackable, (foy) obj2);
                }
                if (trackable instanceof DepthPoint) {
                    return new fol((DepthPoint) trackable, (foy) obj2);
                }
                if (trackable instanceof InstantPlacementPoint) {
                    return new foo((InstantPlacementPoint) trackable, (foy) obj2);
                }
                throw new IllegalArgumentException("Unsupported trackable class ".concat(String.valueOf(String.valueOf(trackable.getClass()))));
            case 7:
                return (fnr) ((Class) this.a).cast((fnr) obj);
            case 8:
                return ((ggr) this.a).d((Integer) obj);
            case 9:
                return ((ggt) this.a).d((Integer) obj);
            case 10:
                return ((goh) obj).a((pka) ((ovx) ((gnt) this.a).b).d);
            case 11:
                return this.a.a(obj);
            case 12:
                int i = gwv.Y;
                return this.a.a(obj);
            case 13:
                return ((hcf) this.a).b((Cursor) obj).a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((hcf) this.a).b((Cursor) obj).a();
            case 15:
                Object obj3 = this.a;
                ltg ltgVar = ltg.MEDIA_STORE;
                hcl hclVar = (hcl) obj3;
                mfq mfqVar = hclVar.d;
                return new hck(hclVar.b, (hce) obj, mfqVar, ltgVar);
            case 16:
                Object obj4 = this.a;
                ltg ltgVar2 = ltg.MEDIA_STORE;
                return new hcn((hcb) ((pmv) obj4).c, (hce) obj, ltgVar2);
            case 17:
                return this.a.a(obj);
            case 18:
                return (Float) this.a.m((CameraCharacteristics.Key) obj);
            case 19:
                return (float[]) this.a.a((CaptureResult.Key) obj);
            default:
                return (Float) this.a.a((CaptureResult.Key) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
