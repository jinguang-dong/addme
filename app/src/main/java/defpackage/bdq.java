package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.view.View;
import androidx.compose.ui.draw.DrawWithContentElement;
import androidx.compose.ui.draw.PainterElement;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdq {
    public static /* synthetic */ bik A(bik bikVar, bne bneVar, bie bieVar, brk brkVar, float f, bkw bkwVar, int i) {
        if ((i & 4) != 0) {
            bieVar = bib.j;
        }
        bie bieVar2 = bieVar;
        if ((i & 8) != 0) {
            brkVar = brj.c;
        }
        brk brkVar2 = brkVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            bkwVar = null;
        }
        return bikVar.cM(new PainterElement(bneVar, z, bieVar2, brkVar2, f2, bkwVar));
    }

    public static final bik B(bik bikVar, uiq uiqVar) {
        return bikVar.cM(new DrawWithContentElement(uiqVar));
    }

    public static final bik C(bik bikVar, blp blpVar) {
        return bko.f(bikVar, 0.0f, 0.0f, blpVar, true, 518143);
    }

    public static final bik D(bik bikVar) {
        return bko.f(bikVar, 0.0f, 0.0f, null, true, 520191);
    }

    private static final void E(int i, int i2) {
        throw new IndexOutOfBoundsException(a.bD(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void F(int i) {
        throw new IndexOutOfBoundsException(a.bE(i, "fromIndex (", ") is less than 0."));
    }

    private static final void G(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void H(int i, int i2) {
        throw new IllegalArgumentException(a.bD(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            E(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            H(i, i2);
        }
        if (i < 0) {
            F(i);
        }
        if (i2 > list.size()) {
            G(i2, list.size());
        }
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int d(int i) {
        return (i - 1) & (-32);
    }

    public static final Object[] e(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final void f(ayc aycVar, uiu uiuVar) {
        ukc.e(uiuVar, 2);
        uiuVar.a(aycVar, 1);
    }

    public static final int g(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int h(int i) {
        return g(2, i);
    }

    public static final int i(int i) {
        return g(1, i);
    }

    public static final boolean j(bai baiVar, bai baiVar2) {
        return baiVar == null || !baiVar.l() || a.ao(baiVar, baiVar2) || a.ao(baiVar.c, baiVar2.c);
    }

    public static final bfh k(int i, Object obj, ayc aycVar) {
        Object objF = aycVar.f();
        if (objF == ayb.a) {
            objF = new bfh(i, true, obj);
            aycVar.w(objF);
        }
        bfh bfhVar = (bfh) objF;
        if (!a.ao(bfhVar.b, obj)) {
            Object obj2 = bfhVar.b;
            bfhVar.b = obj;
            if (obj2 != null && bfhVar.a) {
                bai baiVar = bfhVar.d;
                if (baiVar != null) {
                    baiVar.a();
                    bfhVar.d = null;
                }
                List list = bfhVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((bai) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return bfhVar;
    }

    public static /* synthetic */ void l() {
        bhd.a();
        throw new uer();
    }

    public static final bfs m(ayc aycVar) {
        aycVar.u(1967007797);
        int i = 0;
        Object[] objArr = new Object[0];
        bgb bgbVar = bfv.d;
        ayg aygVar = (ayg) aycVar;
        Object objR = aygVar.R();
        if (objR == ayb.a) {
            objR = new bfw(i);
            aygVar.ac(objR);
        }
        bfv bfvVar = (bfv) o(objArr, bgbVar, (uif) objR, aycVar, 384);
        bfvVar.b = (bfx) aycVar.e(bfz.a);
        aygVar.Y();
        return bfvVar;
    }

    public static final String n(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    public static final Object o(Object[] objArr, bgb bgbVar, uif uifVar, ayc aycVar, int i) {
        return p(Arrays.copyOf(objArr, objArr.length), bgbVar, uifVar, aycVar, (i & ScriptIntrinsicBLAS.TRANSPOSE) | 384 | ((i << 3) & 7168), 0);
    }

    @ueo
    public static final Object p(Object[] objArr, bgb bgbVar, uif uifVar, ayc aycVar, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object objA;
        if ((i2 & 2) != 0) {
            bgbVar = bgc.a;
        }
        bgb bgbVar2 = bgbVar;
        String string = Long.toString(bay.N(aycVar), 36);
        string.getClass();
        bgbVar2.getClass();
        bfx bfxVar = (bfx) aycVar.e(bfz.a);
        Object objF = aycVar.f();
        Object obj2 = ayb.a;
        if (objF == obj2) {
            Object objA2 = (bfxVar == null || (objA = bfxVar.a(string)) == null) ? null : bgbVar2.b.a(objA);
            if (objA2 == null) {
                objA2 = uifVar.a();
            }
            objArr2 = objArr;
            Object bfrVar = new bfr(bgbVar2, bfxVar, string, objA2, objArr2);
            aycVar.w(bfrVar);
            objF = bfrVar;
        } else {
            objArr2 = objArr;
        }
        bfr bfrVar2 = (bfr) objF;
        Object objA3 = Arrays.equals(objArr2, bfrVar2.d) ? bfrVar2.c : null;
        if (objA3 == null) {
            objA3 = uifVar.a();
        }
        boolean zD = aycVar.D(bfrVar2);
        boolean z = true;
        if ((((i & ScriptIntrinsicBLAS.TRANSPOSE) ^ 48) <= 32 || !aycVar.D(bgbVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zD2 = zD | z | aycVar.D(bfxVar) | aycVar.B(string) | aycVar.D(objA3) | aycVar.D(objArr2);
        Object objF2 = aycVar.f();
        if (zD2 || objF2 == obj2) {
            Object obj3 = objA3;
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object nexVar = new nex(bfrVar2, bgbVar2, bfxVar, string, obj, objArr3, 1);
            aycVar.w(nexVar);
            objF2 = nexVar;
        } else {
            obj = objA3;
        }
        azb.g((uif) objF2, aycVar);
        return obj;
    }

    public static final bgb q(uiu uiuVar, uiq uiqVar) {
        aml amlVar = new aml(uiuVar, 4);
        ukc.e(uiqVar, 1);
        return new bgb(amlVar, uiqVar);
    }

    public static final bkh r(bkg bkgVar, long j, long j2, long j3, long j4) {
        return new bkh(bkgVar.b, bkgVar.c, bkgVar.d, bkgVar.e, j, j2, j3, j4);
    }

    public static final bkh s(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new bkh(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final bkg t(long j, long j2) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        return new bkg(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static /* synthetic */ bkb u(int i, uiu uiuVar, int i2) {
        if ((i2 & 2) != 0) {
            uiuVar = null;
        }
        if (1 == (i2 & 1)) {
            i = 1;
        }
        return new bkb(i, uiuVar, 4);
    }

    public static final bjm v(int i) {
        int i2 = 2;
        int i3 = 1;
        if (i == 1) {
            return new bjm(i2);
        }
        if (i == 2) {
            return new bjm(i3);
        }
        if (i == 17) {
            return new bjm(3);
        }
        if (i == 33) {
            return new bjm(5);
        }
        if (i == 66) {
            return new bjm(4);
        }
        if (i != 130) {
            return null;
        }
        return new bjm(6);
    }

    public static final bkg w(View view, View view2) {
        int[] iArr = bjo.a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i - i3;
        float f2 = i2 - iArr[1];
        return new bkg(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final cib x(int i) {
        if (i == 0) {
            return cib.a;
        }
        if (i != 1) {
            return null;
        }
        return cib.b;
    }

    public static final Integer y(int i) {
        if (a.p(i, 5)) {
            return 33;
        }
        if (a.p(i, 6)) {
            return 130;
        }
        if (a.p(i, 3)) {
            return 17;
        }
        if (a.p(i, 4)) {
            return 66;
        }
        if (a.p(i, 1)) {
            return 2;
        }
        return !a.p(i, 2) ? null : 1;
    }

    public static final bik z(bik bikVar, float f) {
        return f == 0.0f ? bikVar : bko.f(bikVar, 0.0f, f, null, false, 524031);
    }
}
