package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fla implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ fla(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int iAy;
        switch (this.a) {
            case 0:
                float[] fArr = fld.a;
                return ((Float) obj).floatValue() >= 0.0f;
            case 1:
                fnm fnmVar = (fnm) obj;
                float[] fArr2 = fld.a;
                return fnmVar.dO() == fnt.TRACKING && fnmVar.c() == null && fnmVar.f().limit() >= 6;
            case 2:
                return ((fps) obj).b >= 40;
            case 3:
                fps fpsVar = (fps) obj;
                return fpsVar.a < 40 || fpsVar.b < 40;
            case 4:
                return pae.i(((oxj) obj).c()).l(pae.c);
            case 5:
                return !pae.i(((oxj) obj).c()).l(pae.c);
            case 6:
                return ((rwc) obj).h();
            case 7:
                return ((fzy) obj).i() == 1;
            case 8:
                return ((gdu) obj).h;
            case 9:
                return ((gdu) obj).a().equals(mhp.HEAT_SEVERE);
            case 10:
                return ((gdu) obj).a().equals(mhp.HEAT_CRITICAL);
            case 11:
                return ((oyz) obj).b() == oym.FRAME_METADATA;
            case 12:
                return ((gpr) obj).l == 2;
            case 13:
                return ((gpr) obj).l == 2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((gpr) obj).i;
            case 15:
                return true;
            case 16:
                meu meuVar = (meu) obj;
                for (met metVar : met.values()) {
                    if (meuVar.n(metVar)) {
                        return true;
                    }
                }
                return false;
            case 17:
                srf srfVar = (srf) obj;
                int i = hdt.e;
                return ((long) srfVar.d) == 3000 && (iAy = a.ay(srfVar.c)) != 0 && iAy == 3;
            case 18:
                return pbw.d(pbw.b((pjs) obj));
            case 19:
                return !pbw.d((pbw) obj);
            default:
                return ((mwl) obj).b;
        }
    }
}
