package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blb {
    public blb() {
        new bzy();
    }

    public static final String A(int i) {
        if (a.p(i, 0)) {
            return "android.widget.Button";
        }
        if (a.p(i, 1)) {
            return "android.widget.CheckBox";
        }
        if (a.p(i, 3)) {
            return "android.widget.RadioButton";
        }
        if (a.p(i, 5)) {
            return "android.widget.ImageView";
        }
        if (a.p(i, 6)) {
            return "android.widget.Spinner";
        }
        if (a.p(i, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final String B(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        str.getClass();
        sb.append(str);
        return sb.toString();
    }

    private static final List C(cbr cbrVar) {
        return cbrVar.l(false, false);
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(bkn bknVar, blh blhVar) {
        if (blhVar instanceof blf) {
            h(bknVar, ((blf) blhVar).a);
        } else if (blhVar instanceof blg) {
            i(bknVar, ((blg) blhVar).a);
        } else {
            if (!(blhVar instanceof ble)) {
                throw new uet();
            }
            g(bknVar, ((ble) blhVar).a);
        }
    }

    @ueo
    public static final Rect c(bkg bkgVar) {
        float f = bkgVar.e;
        float f2 = bkgVar.d;
        return new Rect((int) bkgVar.b, (int) bkgVar.c, (int) f2, (int) f);
    }

    public static final Rect d(chz chzVar) {
        return new Rect(chzVar.b, chzVar.c, chzVar.d, chzVar.e);
    }

    public static final bkg e(Rect rect) {
        return new bkg(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final chz f(Rect rect) {
        return new chz(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void g(bkn bknVar, bkn bknVar2) {
        bknVar.a.addPath(bknVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static /* synthetic */ void h(bkn bknVar, bkg bkgVar) {
        float f = bkgVar.b;
        if (Float.isNaN(f) || Float.isNaN(bkgVar.c) || Float.isNaN(bkgVar.d) || Float.isNaN(bkgVar.e)) {
            bko.a("Invalid rectangle, make sure no value is NaN");
        }
        if (bknVar.b == null) {
            bknVar.b = new RectF();
        }
        RectF rectF = bknVar.b;
        rectF.getClass();
        rectF.set(f, bkgVar.c, bkgVar.d, bkgVar.e);
        Path path = bknVar.a;
        RectF rectF2 = bknVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static /* synthetic */ void i(bkn bknVar, bkh bkhVar) {
        if (bknVar.b == null) {
            bknVar.b = new RectF();
        }
        RectF rectF = bknVar.b;
        rectF.getClass();
        rectF.set(bkhVar.a, bkhVar.b, bkhVar.c, bkhVar.d);
        if (bknVar.c == null) {
            bknVar.c = new float[8];
        }
        float[] fArr = bknVar.c;
        fArr.getClass();
        long j = bkhVar.e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = bkhVar.f;
        fArr[2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = bkhVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = bkhVar.h;
        fArr[6] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        Path path = bknVar.a;
        RectF rectF2 = bknVar.b;
        rectF2.getClass();
        float[] fArr2 = bknVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static final void j(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static void m(bku bkuVar, bkg bkgVar) {
        bkuVar.j(bkgVar.b, bkgVar.c, bkgVar.d, bkgVar.e);
    }

    public static final Shader.TileMode n() {
        return a.p(0, 0) ? Shader.TileMode.CLAMP : a.p(0, 1) ? Shader.TileMode.REPEAT : a.p(0, 2) ? Shader.TileMode.MIRROR : a.p(0, 3) ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
    }

    public static final void o(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int[] p(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = bko.h(((bkv) list.get(i)).g);
        }
        return iArr;
    }

    public static final uiu q(cbr cbrVar) {
        return (uiu) clc.ad(cbrVar.c, cbm.e);
    }

    public static final Object s(buo buoVar, uif uifVar, uhb uhbVar) {
        Object obj;
        bry bryVarZ;
        Object objD;
        bwe bweVar;
        if (buoVar.B().w) {
            if (!buoVar.B().w) {
                bqs.c("visitAncestors called on an unattached node");
            }
            bij bijVar = buoVar.B().p;
            bvm bvmVarB = bko.B(buoVar);
            loop0: while (true) {
                obj = null;
                if (bvmVarB == null) {
                    break;
                }
                if ((bvmVarB.s.f.o & ImageMetadata.LENS_APERTURE) != 0) {
                    while (bijVar != null) {
                        if ((bijVar.n & ImageMetadata.LENS_APERTURE) != 0) {
                            bij bijVarY = bijVar;
                            bdp bdpVar = null;
                            while (bijVarY != null) {
                                if (bijVarY instanceof cap) {
                                    obj = bijVarY;
                                    break loop0;
                                }
                                if ((bijVarY.n & ImageMetadata.LENS_APERTURE) != 0 && (bijVarY instanceof bup)) {
                                    int i = 0;
                                    for (bij bijVar2 = ((bup) bijVarY).y; bijVar2 != null; bijVar2 = bijVar2.q) {
                                        if ((bijVar2.n & ImageMetadata.LENS_APERTURE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bijVarY = bijVar2;
                                            } else {
                                                if (bdpVar == null) {
                                                    bdpVar = new bdp(new bij[16]);
                                                }
                                                if (bijVarY != null) {
                                                    bdpVar.n(bijVarY);
                                                }
                                                bdpVar.n(bijVar2);
                                                bijVarY = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                bijVarY = bko.y(bdpVar);
                            }
                        }
                        bijVar = bijVar.p;
                    }
                }
                bvmVarB = bvmVarB.j();
                bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
            }
            cap capVar = (cap) obj;
            if (capVar != null && (objD = capVar.d((bryVarZ = bko.z(buoVar)), new bpj(uifVar, bryVarZ, 7), uhbVar)) == uhi.a) {
                return objD;
            }
        }
        return ufg.a;
    }

    public static final boolean t(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = ufw.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int iBk = ske.bk(list);
            int i = 0;
            while (i < iBk) {
                i++;
                Object obj2 = list.get(i);
                cbr cbrVar = (cbr) obj2;
                cbr cbrVar2 = (cbr) obj;
                arrayList.add(new bkf((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cbrVar2.c().a() >> 32)) - Float.intBitsToFloat((int) (cbrVar.c().a() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cbrVar2.c().a() & 4294967295L)) - Float.intBitsToFloat((int) (cbrVar.c().a() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((bkf) ske.bB(list2)).a;
        } else {
            if (list2.isEmpty()) {
                cij.b("Empty collection can't be reduced.");
            }
            Object objBB = ske.bB(list2);
            int iBk2 = ske.bk(list2);
            if (iBk2 > 0) {
                int i2 = 1;
                while (true) {
                    objBB = new bkf(a.E(((bkf) objBB).a, ((bkf) list2.get(i2)).a));
                    if (i2 == iBk2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((bkf) objBB).a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean u(cbr cbrVar) {
        return (clc.ad(cbrVar.f(), cbu.f) == null && clc.ad(cbrVar.f(), cbu.e) == null) ? false : true;
    }

    public static final boolean v(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean w(bkn bknVar, float f, float f2) {
        bkg bkgVar = new bkg(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        byte[] bArr = null;
        bkn bknVar2 = new bkn(bArr);
        h(bknVar2, bkgVar);
        bkn bknVar3 = new bkn(bArr);
        Path.Op op = a.p(1, 0) ? Path.Op.DIFFERENCE : a.p(1, 1) ? Path.Op.INTERSECT : a.p(1, 4) ? Path.Op.REVERSE_DIFFERENCE : a.p(1, 2) ? Path.Op.UNION : Path.Op.XOR;
        Path path = bknVar3.a;
        path.op(bknVar.a, bknVar2.a, op);
        boolean zIsEmpty = path.isEmpty();
        bknVar3.k();
        bknVar2.k();
        return !zIsEmpty;
    }

    public static final View x(byv byvVar, int i) {
        Object next;
        Iterator it = byvVar.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((bvm) ((Map.Entry) next).getKey()).c == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (cik) entry.getValue();
        }
        return null;
    }

    public static final bzw y(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((bzw) list.get(i2)).a == i) {
                return (bzw) list.get(i2);
            }
        }
        return null;
    }

    public static final cdl z(cbn cbnVar) {
        uiq uiqVar;
        ArrayList arrayList = new ArrayList();
        cbc cbcVar = (cbc) clc.ad(cbnVar, cbm.a);
        if (cbcVar == null || (uiqVar = (uiq) cbcVar.b) == null || !((Boolean) uiqVar.a(arrayList)).booleanValue()) {
            return null;
        }
        return (cdl) arrayList.get(0);
    }

    public static final void r(cbr cbrVar, int i, uiq uiqVar) {
        cbr cbrVar2;
        bdp bdpVar = new bdp(new cbr[16]);
        List listC = C(cbrVar);
        int i2 = bdpVar.b;
        while (true) {
            bdpVar.p(i2, listC);
            while (true) {
                int i3 = bdpVar.b;
                if (i3 == 0) {
                    return;
                }
                cbrVar2 = (cbr) bdpVar.c(i3 - 1);
                if (!cbs.a(cbrVar2)) {
                    cbn cbnVar = cbrVar2.c;
                    if (cbnVar.f(cbu.i)) {
                        continue;
                    } else {
                        bwi bwiVarE = cbrVar2.e();
                        if (bwiVarE == null) {
                            bqs.a(PNlJufQ.UOXVThtX);
                            throw new uer();
                        }
                        chz chzVarC = chx.c(byi.w(bwiVarE));
                        if (chzVarC.b < chzVarC.d && chzVarC.c < chzVarC.e) {
                            uiu uiuVarQ = q(cbrVar2);
                            cbl cblVar = (cbl) clc.ad(cbnVar, cbu.u);
                            if (uiuVarQ == null || cblVar == null || ((Number) cblVar.b.a()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i4 = i + 1;
                            uiqVar.a(new cbb(cbrVar2, i4, chzVarC, bwiVarE));
                            r(cbrVar2, i4, uiqVar);
                        }
                    }
                }
            }
            listC = C(cbrVar2);
            i2 = bdpVar.b;
        }
    }
}
