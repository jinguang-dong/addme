package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.SharedLibraryVersion;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amj implements uiv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public amj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [afn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [akx, java.lang.Object] */
    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ayc aycVar = (ayc) obj2;
                ((Number) obj3).intValue();
                aycVar.u(-1608161351);
                ?? r0 = this.a;
                boolean zB = aycVar.B(r0);
                Object objF = aycVar.f();
                if (zB || objF == ayb.a) {
                    objF = new ald(r0);
                    aycVar.w(objF);
                }
                ald aldVar = (ald) objF;
                aycVar.n();
                break;
            case 1:
                ayc aycVar2 = (ayc) obj2;
                ((Number) obj3).intValue();
                aycVar2.u(-353972293);
                boolean zB2 = aycVar2.B(this.a.a(aycVar2));
                Object objF2 = aycVar2.f();
                if (zB2 || objF2 == ayb.a) {
                    objF2 = new afp();
                    aycVar2.w(objF2);
                }
                afp afpVar = (afp) objF2;
                aycVar2.n();
                break;
            case 2:
                ayc aycVar3 = (ayc) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && aycVar3.G()) {
                    aycVar3.r();
                } else {
                    auv.b((String) this.a, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, aycVar3, 0, 0, 131070);
                }
                break;
            case 3:
                ayc aycVar4 = (ayc) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (aycVar4.H((iIntValue & 17) != 16, iIntValue & 1)) {
                    Object obj4 = this.a;
                    boolean zB3 = aycVar4.B(obj4);
                    Object objF3 = aycVar4.f();
                    if (zB3 || objF3 == ayb.a) {
                        objF3 = AmbientLifecycleObserverKt.e(bik.c, new ats(obj4, 18));
                        aycVar4.w(objF3);
                    }
                    amo.c((bik) objF3, aycVar4);
                } else {
                    aycVar4.r();
                }
                break;
            case 4:
                ayc aycVar5 = (ayc) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (aycVar5.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    Object obj5 = this.a;
                    boolean zB4 = aycVar5.B(obj5);
                    Object objF4 = aycVar5.f();
                    if (zB4 || objF4 == ayb.a) {
                        objF4 = AmbientLifecycleObserverKt.e(bik.c, new ats(obj5, 19));
                        aycVar5.w(objF4);
                    }
                    amo.c((bik) objF4, aycVar5);
                } else {
                    aycVar5.r();
                }
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ayc aycVar6 = (ayc) obj2;
                ((Number) obj3).intValue();
                aycVar6.u(-701460855);
                Object obj6 = this.a;
                long j = zBooleanValue ? ((dpf) obj6).a : ((dpf) obj6).c;
                aycVar6.n();
                break;
            case 6:
                akx akxVar = (akx) obj;
                ayc aycVar7 = (ayc) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= true == aycVar7.B(akxVar) ? 4 : 2;
                }
                if (aycVar7.H((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    drc.e((dlh) this.a, akxVar.a(bik.c, bib.k), null, null, aycVar7, 0);
                } else {
                    aycVar7.r();
                }
                break;
            case 7:
                akx akxVar2 = (akx) obj;
                ayc aycVar8 = (ayc) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= true == aycVar8.B(akxVar2) ? 4 : 2;
                }
                if (aycVar8.H((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    drc.f((dme) this.a, akxVar2.a(bik.c, bib.k), null, null, aycVar8, 0);
                } else {
                    aycVar8.r();
                }
                break;
            case 8:
                ayc aycVar9 = (ayc) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                ((dky) obj).getClass();
                if ((iIntValue5 & 17) == 16 && aycVar9.G()) {
                    aycVar9.r();
                } else {
                    a.bj(byx.d(R.drawable.product_logo_camera_round_color_24, aycVar9, 0), this.a.a(amd.c(bik.c, byx.c(R.dimen.wear_tap_to_open_camera_icon_size, aycVar9)), bib.g), null, null, 0.0f, aycVar9, 48);
                }
                break;
            case 9:
                ayc aycVar10 = (ayc) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                ((amc) obj).getClass();
                if ((iIntValue6 & 17) == 16 && aycVar10.G()) {
                    aycVar10.r();
                } else {
                    nry nryVar = (nry) this.a;
                    jsv.r(nryVar.a, nryVar.h, 0L, SharedLibraryVersion.j(aycVar10).f, SharedLibraryVersion.h(aycVar10).x, aycVar10, 0, 4);
                }
                break;
            default:
                ayc aycVar11 = (ayc) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                ((amc) obj).getClass();
                if ((iIntValue7 & 17) == 16 && aycVar11.G()) {
                    aycVar11.r();
                } else {
                    Object obj7 = this.a;
                    if (obj7 != null) {
                        jsv.r(((Integer) obj7).intValue(), null, 0L, SharedLibraryVersion.j(aycVar11).j, SharedLibraryVersion.h(aycVar11).e, aycVar11, 0, 6);
                    }
                }
                break;
        }
        return ufg.a;
    }
}
