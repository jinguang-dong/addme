package defpackage;

import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.SharedLibraryVersion;
import com.google.android.apps.camera.wear.wearappv2.elapsedtimer.ComposeElapsedTimerUi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arv implements uiu {
    private final /* synthetic */ int h;
    public static final arv g = new arv(9);
    public static final arv f = new arv(7);
    public static final arv e = new arv(5);
    public static final arv d = new arv(4);
    public static final arv c = new arv(3);
    public static final arv b = new arv(1);
    public static final arv a = new arv(0);

    public arv(int i) {
        this.h = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                acv.i((ayc) obj, ((Number) obj2).intValue());
                return ufg.a;
            case 1:
                acv.i((ayc) obj, ((Number) obj2).intValue());
                return ufg.a;
            case 2:
                ayc aycVar = (ayc) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (aycVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                    throw null;
                }
                aycVar.r();
                return ufg.a;
            case 3:
                ayc aycVar2 = (ayc) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (aycVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    auv.c(null, 0L, 0L, 0L, 0L, 0, false, 0, null, null, aycVar2, 6, 0);
                } else {
                    aycVar2.r();
                }
                return ufg.a;
            case 4:
                ayc aycVar3 = (ayc) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                int i = iIntValue3 & 3;
                if (aycVar3.H(i != 2, iIntValue3 & 1)) {
                    chx.u(null, null, 0.0f, 0L, null, null, null, aycVar3, 0, 127);
                } else {
                    aycVar3.r();
                }
                return ufg.a;
            case 5:
                return a.ag(obj, obj2);
            case 6:
                ayc aycVar4 = (ayc) obj;
                ((Number) obj2).intValue();
                aycVar4.u(-1454894771);
                aycVar4.u(2039846104);
                aycVar4.n();
                aycVar4.u(2005465148);
                String str = drr.a;
                djw djwVarA = SharedLibraryVersion.j(aycVar4).a.a(new djw(bkv.f, AmbientMode.AmbientCallback.i(SharedLibraryVersion.h(aycVar4).x, 80.0f), cid.a, (cfp) null, (cfj) null, (cfk) null, 0L, 0L, 0L, 1016));
                aycVar4.n();
                aycVar4.n();
                return djwVarA;
            case 7:
                ayc aycVar5 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar5.G()) {
                    aycVar5.r();
                } else {
                    jsv.w(aycVar5, 0);
                }
                return ufg.a;
            case 8:
                ayc aycVar6 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar6.G()) {
                    aycVar6.r();
                } else {
                    ComposeElapsedTimerUi.e();
                    jsv.v(null, aycVar6, 0);
                }
                return ufg.a;
            default:
                ayc aycVar7 = (ayc) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && aycVar7.G()) {
                    aycVar7.r();
                } else {
                    aycVar7.u(1849434622);
                    Object objF = aycVar7.f();
                    if (objF == ayb.a) {
                        objF = new aud(7);
                        aycVar7.w(objF);
                    }
                    aycVar7.n();
                    chx.u(null, null, 0.0f, 0L, null, null, (uiu) objF, aycVar7, 1572864, 63);
                }
                return ufg.a;
        }
    }
}
