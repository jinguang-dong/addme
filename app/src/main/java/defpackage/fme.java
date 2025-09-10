package defpackage;

import android.hardware.camera2.CaptureRequest;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fme implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fme(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v83, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, uiq] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) this.a.a(obj)).booleanValue();
            case 1:
                return ((Boolean) this.a.a(obj)).booleanValue();
            case 2:
                return ((Boolean) this.a.a(obj)).booleanValue();
            case 3:
                return ((CaptureRequest.Key) obj).getName().equals(((CaptureRequest.Key) this.a).getName());
            case 4:
                return ((gcv) obj).g(((fxy) ((fpc) this.a).a).j);
            case 5:
                return ((gdu) obj).g.equals(this.a);
            case 6:
                krj krjVar = (krj) obj;
                nkw nkwVarD = krjVar.d();
                if (!((Boolean) this.a.dL()).booleanValue()) {
                    boolean z = nkwVarD.equals(nkw.VIDEO) || nkwVarD.equals(nkw.AMBER) || nkwVarD.equals(nkw.ROOSTER) || nkwVarD.equals(nkw.SLOW_MOTION) || nkwVarD.equals(nkw.VIDEO_INTENT) || nkwVarD.equals(nkw.VIDEO_NIGHT_SIGHT);
                    if (!krjVar.s() && krjVar.f && z) {
                        return true;
                    }
                } else if (krjVar.f && nkwVarD.equals(nkw.VIDEO_INTENT)) {
                    return true;
                }
                return false;
            case 7:
                return ((gns) obj).a == this.a;
            case 8:
                gns gnsVar = (gns) obj;
                if (gnsVar.b && gnsVar.c) {
                    if (gnsVar.a == this.a) {
                        return true;
                    }
                }
                return false;
            case 9:
                return ((gns) obj).a == this.a;
            case 10:
                return ((gns) obj).a == this.a;
            case 11:
                return ((gpr) obj).a == ((gqx) this.a).e;
            case 12:
                int i = hjb.z;
                return ((mwk) obj).a.a.al.equals(((muz) this.a).al);
            case 13:
                mwk mwkVar = (mwk) obj;
                int i2 = hjb.z;
                return mwkVar.a.a.al.equals(((muz) this.a).al) && mwkVar.b.c();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((hzl) this.a).a((String) obj);
            case 15:
                return ((iqh) ((nbe) obj).a).equals(this.a);
            case 16:
                nbe nbeVar = (nbe) obj;
                return Objects.equals(Boolean.valueOf(nbeVar.j), ((sbv) this.a).get(nbeVar.a));
            case 17:
                sgv sgvVar = irk.a;
                return ((scn) this.a).contains(((Map.Entry) obj).getKey());
            case 18:
                sgv sgvVar2 = irk.a;
                return ((scn) this.a).contains(((Map.Entry) obj).getKey());
            case 19:
                return ((sbe) this.a).contains((isj) obj);
            default:
                return this.a.containsKey((lcz) obj);
        }
    }
}
