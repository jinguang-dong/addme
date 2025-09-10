package defpackage;

import android.view.View;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbi implements Comparator {
    private final /* synthetic */ int f;
    public static final cbi e = new cbi(10);
    public static final cbi d = new cbi(3);
    public static final cbi c = new cbi(2);
    public static final cbi b = new cbi(1);
    public static final cbi a = new cbi(0);

    public cbi(int i) {
        this.f = i;
    }

    private static final bdp a(bvm bvmVar) {
        bdp bdpVar = new bdp(new bvm[16]);
        while (bvmVar != null) {
            bdpVar.f(0, bvmVar);
            bvmVar = bvmVar.j();
        }
        return bdpVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.f) {
            case 0:
                bkg bkgVarD = ((cbr) obj).d();
                bkg bkgVarD2 = ((cbr) obj2).d();
                int iCompare = Float.compare(bkgVarD.b, bkgVarD2.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(bkgVarD.c, bkgVarD2.c);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(bkgVarD.e, bkgVarD2.e);
                return iCompare3 != 0 ? iCompare3 : Float.compare(bkgVarD.d, bkgVarD2.d);
            case 1:
                bkb bkbVar = (bkb) obj;
                bkb bkbVar2 = (bkb) obj2;
                if (!acv.A(bkbVar) || !acv.A(bkbVar2)) {
                    if (acv.A(bkbVar)) {
                        return -1;
                    }
                    return acv.A(bkbVar2) ? 1 : 0;
                }
                bvm bvmVarB = bko.B(bkbVar);
                bvm bvmVarB2 = bko.B(bkbVar2);
                if (a.ao(bvmVarB, bvmVarB2)) {
                    return 0;
                }
                bdp bdpVarA = a(bvmVarB);
                bdp bdpVarA2 = a(bvmVarB2);
                int iMin = Math.min(bdpVarA.b - 1, bdpVarA2.b - 1);
                if (iMin >= 0) {
                    while (a.ao(bdpVarA.a[i], bdpVarA2.a[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return ujp.a(((bvm) bdpVarA.a[i]).f(), ((bvm) bdpVarA2.a[i]).f());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            case 2:
                bkg bkgVarD3 = ((cbr) obj).d();
                bkg bkgVarD4 = ((cbr) obj2).d();
                int iCompare4 = Float.compare(bkgVarD4.d, bkgVarD3.d);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(bkgVarD3.c, bkgVarD4.c);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(bkgVarD3.e, bkgVarD4.e);
                return iCompare6 != 0 ? iCompare6 : Float.compare(bkgVarD4.b, bkgVarD3.b);
            case 3:
                bkg bkgVar = (bkg) ((uev) obj).a;
                float f = bkgVar.c;
                bkg bkgVar2 = (bkg) ((uev) obj2).a;
                int iCompare7 = Float.compare(f, bkgVar2.c);
                return iCompare7 != 0 ? iCompare7 : Float.compare(bkgVar.e, bkgVar2.e);
            case 4:
                return ((cji) obj).c - ((cji) obj2).c;
            case 5:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 6:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                int i2 = iArr[0];
                int i3 = iArr2[0];
                return i2 == i3 ? iArr[1] - iArr2[1] : i2 - i3;
            case 7:
                enx enxVar = (enx) obj;
                enx enxVar2 = (enx) obj2;
                return enxVar.b() == enxVar2.b() ? enxVar.a() - enxVar2.a() : enxVar.b() - enxVar2.b();
            case 8:
                return Float.compare(((hru) obj2).c, ((hru) obj).c);
            case 9:
                pas pasVar = (pas) obj;
                pas pasVar2 = (pas) obj2;
                return (pasVar2.a * pasVar2.b) - (pasVar.a * pasVar.b);
            case 10:
                return Long.compare(((pfd) obj).r(), ((pfd) obj2).r());
            case 11:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 12:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                vav vavVar = (vav) obj;
                vav vavVar2 = (vav) obj2;
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(vavVar.a.getName())) {
                    return 1;
                }
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(vavVar2.a.getName())) {
                    return -1;
                }
                return -CronetEngine.Builder.compareVersions(vavVar.a.getVersion(), vavVar2.a.getVersion());
        }
    }
}
