package defpackage;

import com.google.android.apps.camera.ui.views.CountdownSnapSlider;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class glx implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ glx(Object obj, int i) {
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

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v70, types: [java.lang.Object, owf] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                krj krjVar = (krj) obj;
                nkw nkwVarD = krjVar.d();
                if (((Boolean) this.a.dL()).booleanValue()) {
                    return nkwVarD.equals(nkw.VIDEO);
                }
                if (krjVar.s()) {
                    return nkwVarD.equals(nkw.VIDEO) || nkwVarD.equals(nkw.VIDEO_INTENT);
                }
            case 1:
                return !((Boolean) ((ovx) this.a).d).booleanValue();
            case 2:
                return ((gns) obj).a == this.a;
            case 3:
                krj krjVar2 = (krj) obj;
                nkw nkwVarD2 = krjVar2.d();
                if (nkwVarD2 != nkw.PORTRAIT) {
                    if (krjVar2.s() || ((Boolean) this.a.dL()).booleanValue()) {
                        return nkwVarD2 == nkw.PHOTO || nkwVarD2 == nkw.NIGHT_SIGHT;
                    }
                    return false;
                }
                return true;
            case 4:
                krj krjVar3 = (krj) obj;
                return ((jho) this.a).c(krjVar3.d()) && !krjVar3.s();
            case 5:
                sgv sgvVar = jjn.a;
                return ((sbp) this.a).contains(((jju) obj).b());
            case 6:
                sgv sgvVar2 = jjn.a;
                return ((jju) obj).c().equals(this.a);
            case 7:
                int i = jkx.n;
                return ((jju) obj).b().equals(this.a);
            case 8:
                return this.a.contains(((krz) obj).h());
            case 9:
                return ((scn) this.a).contains(((krz) obj).h());
            case 10:
                return ((scn) this.a).contains(((krz) obj).h());
            case 11:
                krz krzVar = (krz) obj;
                return krzVar.dZ().equals(kry.PRO) && krzVar.p((krj) this.a);
            case 12:
                return ((nkw) this.a).equals(((krj) obj).d());
            case 13:
                krj krjVar4 = (krj) obj;
                sgv sgvVar3 = ktb.a;
                nkw nkwVarD3 = krjVar4.d();
                return ((Boolean) this.a.dL()).booleanValue() ? nkwVarD3.equals(nkw.PHOTO) || nkwVarD3.equals(nkw.PORTRAIT) : (nkwVarD3.equals(nkw.PHOTO) || nkwVarD3.equals(nkw.PORTRAIT) || nkwVarD3.equals(nkw.IMAGE_INTENT)) && krjVar4.s();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((krs) this.a).equals(((kto) obj).g());
            case 15:
                return ((sbp) this.a).contains(((pjo) obj).j());
            case 16:
                return ((Boolean) this.a.dL()).booleanValue();
            case 17:
                sbp sbpVar = mzk.b;
                return !((sbp) this.a).contains((nkw) obj);
            default:
                return ((CountdownSnapSlider) this.a).b.get((Integer) obj) == mtq.ENABLED;
        }
    }
}
