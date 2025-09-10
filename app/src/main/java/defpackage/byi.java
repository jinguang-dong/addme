package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.support.v7.widget.RecyclerView;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import android.util.Size;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.compose.animation.EnterExitTransitionElement;
import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.layout.OffsetPxElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.layout.LayoutElement;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class byi {
    public byi() {
    }

    public static void A(bnh bnhVar, boj bojVar) {
        List list = bojVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            byi byiVar = (byi) list.get(i);
            if (byiVar instanceof bon) {
                bnl bnlVar = new bnl();
                bon bonVar = (bon) byiVar;
                bnlVar.c = bonVar.b;
                bnlVar.m = true;
                bnlVar.f();
                bnlVar.p.m(bonVar.c);
                bnlVar.f();
                String str = bonVar.a;
                bnlVar.f();
                bnlVar.a = bonVar.d;
                bnlVar.f();
                bnlVar.b = bonVar.e;
                bnlVar.f();
                bnlVar.f = bonVar.f;
                bnlVar.f();
                bnlVar.d = bonVar.g;
                bnlVar.f();
                bnlVar.e = bonVar.h;
                bnlVar.n = true;
                bnlVar.f();
                bnlVar.g = bonVar.i;
                bnlVar.n = true;
                bnlVar.f();
                bnlVar.h = bonVar.j;
                bnlVar.n = true;
                bnlVar.f();
                bnlVar.i = bonVar.k;
                bnlVar.n = true;
                bnlVar.f();
                bnlVar.j = bonVar.l;
                bnlVar.o = true;
                bnlVar.f();
                bnlVar.k = bonVar.m;
                bnlVar.o = true;
                bnlVar.f();
                bnlVar.l = bonVar.n;
                bnlVar.o = true;
                bnlVar.f();
                bnhVar.c(i, bnlVar);
            } else if (byiVar instanceof boj) {
                bnh bnhVar2 = new bnh();
                boj bojVar2 = (boj) byiVar;
                bnhVar2.f = bojVar2.a;
                bnhVar2.f();
                bnhVar2.g = bojVar2.b;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.j = bojVar2.e;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.k = bojVar2.f;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.l = bojVar2.g;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.m = bojVar2.h;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.h = bojVar2.c;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.i = bojVar2.d;
                bnhVar2.n = true;
                bnhVar2.f();
                bnhVar2.c = bojVar2.i;
                bnhVar2.d = true;
                bnhVar2.f();
                A(bnhVar2, bojVar2);
                bnhVar.c(i, bnhVar2);
            }
        }
    }

    public static void B(List list, bkn bknVar) {
        int i;
        float f;
        int i2;
        bof bofVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        List list2 = list;
        bkn bknVar2 = bknVar;
        int iA = bknVar2.a();
        bknVar2.l();
        bknVar2.m(iA);
        bof bofVar2 = list2.isEmpty() ? bnn.a : (bof) list2.get(0);
        int size = list2.size();
        float f16 = 0.0f;
        int i3 = 0;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (i3 < size) {
            bof bofVar3 = (bof) list2.get(i3);
            if (bofVar3 instanceof bnn) {
                bknVar2.c();
                i = size;
                f = f16;
                i2 = i3;
                bofVar = bofVar3;
                f17 = f21;
                f20 = f17;
                f18 = f22;
                f19 = f18;
            } else {
                if (bofVar3 instanceof bnz) {
                    bnz bnzVar = (bnz) bofVar3;
                    float f23 = bnzVar.a;
                    f19 += f23;
                    float f24 = bnzVar.b;
                    f20 += f24;
                    bknVar2.a.rMoveTo(f23, f24);
                    i = size;
                    f = f16;
                    i2 = i3;
                    f22 = f19;
                    f21 = f20;
                } else {
                    if (bofVar3 instanceof bnr) {
                        bnr bnrVar = (bnr) bofVar3;
                        float f25 = bnrVar.a;
                        float f26 = bnrVar.b;
                        bknVar2.f(f25, f26);
                        f20 = f26;
                        f21 = f20;
                        f19 = f25;
                        f22 = f19;
                    } else {
                        if (bofVar3 instanceof bny) {
                            bny bnyVar = (bny) bofVar3;
                            float f27 = bnyVar.a;
                            f15 = bnyVar.b;
                            bknVar2.i(f27, f15);
                            f19 += f27;
                        } else {
                            if (bofVar3 instanceof bnq) {
                                bnq bnqVar = (bnq) bofVar3;
                                f4 = bnqVar.a;
                                f5 = bnqVar.b;
                                bknVar2.e(f4, f5);
                            } else if (bofVar3 instanceof bnx) {
                                float f28 = ((bnx) bofVar3).a;
                                bknVar2.i(f28, f16);
                                f19 += f28;
                            } else if (bofVar3 instanceof bnp) {
                                float f29 = ((bnp) bofVar3).a;
                                bknVar2.e(f29, f20);
                                f19 = f29;
                            } else if (bofVar3 instanceof bod) {
                                f15 = ((bod) bofVar3).a;
                                bknVar2.i(f16, f15);
                            } else if (bofVar3 instanceof boe) {
                                float f30 = ((boe) bofVar3).a;
                                bknVar2.e(f19, f30);
                                f20 = f30;
                            } else {
                                if (bofVar3 instanceof bnw) {
                                    bnw bnwVar = (bnw) bofVar3;
                                    float f31 = bnwVar.a;
                                    float f32 = bnwVar.b;
                                    f11 = bnwVar.c;
                                    f12 = bnwVar.d;
                                    f13 = bnwVar.e;
                                    f14 = bnwVar.f;
                                    bknVar2.h(f31, f32, f11, f12, f13, f14);
                                } else {
                                    if (bofVar3 instanceof bno) {
                                        bno bnoVar = (bno) bofVar3;
                                        float f33 = bnoVar.a;
                                        float f34 = bnoVar.b;
                                        f18 = bnoVar.c;
                                        f6 = bnoVar.d;
                                        f7 = bnoVar.e;
                                        f8 = bnoVar.f;
                                        bknVar.d(f33, f34, f18, f6, f7, f8);
                                    } else if (bofVar3 instanceof bob) {
                                        if (bofVar2.h) {
                                            f9 = f19 - f18;
                                            f10 = f20 - f17;
                                        } else {
                                            f9 = f16;
                                            f10 = f9;
                                        }
                                        bob bobVar = (bob) bofVar3;
                                        f11 = bobVar.a;
                                        f12 = bobVar.b;
                                        f13 = bobVar.c;
                                        f14 = bobVar.d;
                                        bknVar.h(f9, f10, f11, f12, f13, f14);
                                    } else if (bofVar3 instanceof bnt) {
                                        if (bofVar2.h) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        bnt bntVar = (bnt) bofVar3;
                                        f18 = bntVar.a;
                                        f6 = bntVar.b;
                                        f7 = bntVar.c;
                                        f8 = bntVar.d;
                                        bknVar.d(f19, f20, f18, f6, f7, f8);
                                    } else if (bofVar3 instanceof boa) {
                                        boa boaVar = (boa) bofVar3;
                                        float f35 = boaVar.a;
                                        float f36 = boaVar.b;
                                        float f37 = boaVar.c;
                                        float f38 = boaVar.d;
                                        bknVar.j(f35, f36, f37, f38);
                                        float f39 = f35 + f19;
                                        float f40 = f36 + f20;
                                        f19 += f37;
                                        f20 += f38;
                                        f18 = f39;
                                        f17 = f40;
                                    } else if (bofVar3 instanceof bns) {
                                        bns bnsVar = (bns) bofVar3;
                                        float f41 = bnsVar.a;
                                        float f42 = bnsVar.b;
                                        f4 = bnsVar.c;
                                        f5 = bnsVar.d;
                                        bknVar.g(f41, f42, f4, f5);
                                        f18 = f41;
                                        f17 = f42;
                                    } else if (bofVar3 instanceof boc) {
                                        if (bofVar2.i) {
                                            f2 = f20 - f17;
                                            f3 = f19 - f18;
                                        } else {
                                            f2 = f16;
                                            f3 = f2;
                                        }
                                        boc bocVar = (boc) bofVar3;
                                        float f43 = bocVar.a;
                                        float f44 = bocVar.b;
                                        bknVar.j(f3, f2, f43, f44);
                                        float f45 = f3 + f19;
                                        float f46 = f2 + f20;
                                        f19 += f43;
                                        f20 += f44;
                                        f18 = f45;
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        bofVar = bofVar3;
                                        f17 = f46;
                                    } else if (bofVar3 instanceof bnu) {
                                        if (bofVar2.i) {
                                            f20 = (f20 + f20) - f17;
                                            f19 = (f19 + f19) - f18;
                                        }
                                        bnu bnuVar = (bnu) bofVar3;
                                        float f47 = bnuVar.a;
                                        float f48 = bnuVar.b;
                                        bknVar.g(f19, f20, f47, f48);
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        f18 = f19;
                                        bofVar = bofVar3;
                                        f19 = f47;
                                        f17 = f20;
                                        f20 = f48;
                                    } else if (bofVar3 instanceof bnv) {
                                        double d = f19;
                                        bnv bnvVar = (bnv) bofVar3;
                                        float f49 = bnvVar.f + f19;
                                        float f50 = bnvVar.g + f20;
                                        f = 0.0f;
                                        i2 = i3;
                                        i = size;
                                        g(bknVar, d, f20, f49, f50, bnvVar.a, bnvVar.b, bnvVar.c, bnvVar.d, bnvVar.e);
                                        f18 = f49;
                                        f19 = f18;
                                        f17 = f50;
                                        f20 = f17;
                                        bofVar = bofVar3;
                                    } else {
                                        i = size;
                                        f = f16;
                                        i2 = i3;
                                        if (!(bofVar3 instanceof bnm)) {
                                            throw new uet();
                                        }
                                        bnm bnmVar = (bnm) bofVar3;
                                        float f51 = bnmVar.f;
                                        float f52 = bnmVar.g;
                                        bofVar = bofVar3;
                                        g(bknVar, f19, f20, f51, f52, bnmVar.a, bnmVar.b, bnmVar.c, bnmVar.d, bnmVar.e);
                                        f18 = f51;
                                        f19 = f18;
                                        f17 = f52;
                                        f20 = f17;
                                    }
                                    f17 = f6;
                                    f19 = f7;
                                    f20 = f8;
                                }
                                f18 = f11 + f19;
                                float f53 = f12 + f20;
                                f19 += f13;
                                f20 += f14;
                                f17 = f53;
                            }
                            f20 = f5;
                            f19 = f4;
                        }
                        f20 += f15;
                    }
                    i = size;
                    f = f16;
                    i2 = i3;
                }
                bofVar = bofVar3;
            }
            i3 = i2 + 1;
            list2 = list;
            bknVar2 = bknVar;
            size = i;
            bofVar2 = bofVar;
            f16 = f;
        }
    }

    public static boj C(bni bniVar) {
        return new boj(bniVar.a, bniVar.b, bniVar.c, bniVar.d, bniVar.e, bniVar.f, bniVar.g, bniVar.h, bniVar.i, bniVar.j);
    }

    public static bni D(ArrayList arrayList) {
        return (bni) arrayList.get(arrayList.size() - 1);
    }

    public static void E(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        arrayList.add(new bni(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public static void F(ArrayList arrayList) {
        D(arrayList).j.add(C((bni) arrayList.remove(arrayList.size() - 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void G(defpackage.bmv r20, defpackage.bmz r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.G(bmv, bmz):void");
    }

    public static long H(bmv bmvVar) {
        return ((bmt) bmvVar).b.a();
    }

    public static /* synthetic */ void I(bmv bmvVar, long j, long j2, long j3, long j4, int i, int i2) {
        long j5;
        bmv bmvVar2;
        long j6;
        long j7;
        long j8;
        int i3;
        int i4 = i2 & 2;
        bmx bmxVar = bmx.a;
        if (i4 != 0) {
            j5 = 0;
            j6 = j;
            j7 = j3;
            j8 = j4;
            i3 = i;
            bmvVar2 = bmvVar;
        } else {
            j5 = j2;
            bmvVar2 = bmvVar;
            j6 = j;
            j7 = j3;
            j8 = j4;
            i3 = i;
        }
        bmvVar2.s(j6, j5, j7, j8, bmxVar, i3);
    }

    public static /* synthetic */ void J(bmv bmvVar, bks bksVar, int i) {
        long jAc = a.ac(bmvVar.m(), 0L);
        bmt bmtVar = ((bvo) bmvVar).a;
        bmtVar.a.c.o(Float.intBitsToFloat(0), Float.intBitsToFloat(0), Float.intBitsToFloat(0) + Float.intBitsToFloat((int) (jAc >> 32)), Float.intBitsToFloat(0) + Float.intBitsToFloat((int) (jAc & 4294967295L)), bmt.y(bmtVar, bksVar, bmx.a, 1.0f, i));
    }

    public static /* synthetic */ void L(bmv bmvVar, bkl bklVar, long j, long j2, float f, bkw bkwVar, int i, int i2) {
        long jA = (i2 & 4) != 0 ? (bklVar.a() & 4294967295L) | (bklVar.b() << 32) : j;
        bmvVar.v(bklVar, jA, (i2 & 16) != 0 ? jA : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? bmx.a : null, (i2 & 128) != 0 ? null : bkwVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static float M(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static boolean N(double d, bmg bmgVar, bmg bmgVar2) {
        return Math.abs(bmgVar.a(d) - bmgVar2.a(d)) <= 0.001d;
    }

    public static double O(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static double P(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static boolean Q(bmp bmpVar, bmp bmpVar2) {
        if (bmpVar != bmpVar2) {
            return Math.abs(bmpVar.a - bmpVar2.a) < 0.001f && Math.abs(bmpVar.b - bmpVar2.b) < 0.001f;
        }
        return true;
    }

    public static float[] R(float[] fArr, float[] fArr2, float[] fArr3) {
        W(fArr, fArr2);
        W(fArr, fArr3);
        return T(S(fArr), U(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static float[] S(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static float[] T(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static float[] U(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static /* synthetic */ blz V(blz blzVar, bmp bmpVar) {
        boolean zQ = a.q(blzVar.b, 12884901888L);
        blx blxVar = blx.b;
        if (zQ) {
            blzVar.getClass();
            bmn bmnVar = (bmn) blzVar;
            bmp bmpVar2 = bmnVar.d;
            if (!Q(bmpVar2, bmpVar)) {
                return new bmn(bmnVar.a, bmnVar.h, bmpVar, T(R(blxVar.c, bmpVar2.a(), bmpVar.a()), bmnVar.i), bmnVar.k, bmnVar.n, bmnVar.e, bmnVar.f, bmnVar.g, -1);
            }
        }
        return blzVar;
    }

    public static void W(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static bme X(blz blzVar, blz blzVar2) {
        if (blzVar == blzVar2) {
            return new bmc(blzVar);
        }
        if (!a.q(blzVar.b, 12884901888L) || !a.q(blzVar2.b, 12884901888L)) {
            return new bme(blzVar, blzVar2, 0);
        }
        blzVar.getClass();
        blzVar2.getClass();
        return new bmd((bmn) blzVar, (bmn) blzVar2);
    }

    public static long Y(float f) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.5f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
        long j = blt.a;
        return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
    }

    public static boolean Z(float[] fArr) {
        return fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static float aA(alz alzVar) {
        if (alzVar != null) {
            return alzVar.a;
        }
        return 0.0f;
    }

    public static alz aB(bru bruVar) {
        Object objG = bruVar.g();
        if (objG instanceof alz) {
            return (alz) objG;
        }
        return null;
    }

    public static alz aC(bte bteVar) {
        Object objG = bteVar.g();
        if (objG instanceof alz) {
            return (alz) objG;
        }
        return null;
    }

    public static float aD(alv alvVar, cib cibVar) {
        return cibVar == cib.a ? alvVar.c(cibVar) : alvVar.b(cibVar);
    }

    public static float aE(alv alvVar, cib cibVar) {
        return cibVar == cib.a ? alvVar.b(cibVar) : alvVar.c(cibVar);
    }

    public static bik aF(bik bikVar, alv alvVar) {
        return bikVar.cM(new PaddingValuesElement(alvVar));
    }

    public static bik aG(bik bikVar, float f) {
        return bikVar.cM(new PaddingElement(f, f, f, f));
    }

    public static bik aH(bik bikVar, float f, float f2) {
        return bikVar.cM(new PaddingElement(f, f2, f, f2));
    }

    public static bik aI(bik bikVar, float f, float f2, float f3, float f4) {
        return bikVar.cM(new PaddingElement(f, f2, f3, f4));
    }

    public static /* synthetic */ alv aJ(float f, int i) {
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new alw(f, 0.0f, f, 0.0f);
    }

    public static /* synthetic */ alv aK(float f, float f2, int i) {
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new alw(0.0f, f, 0.0f, f2);
    }

    public static /* synthetic */ bik aL(bik bikVar, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return aH(bikVar, f, f2);
    }

    public static /* synthetic */ bik aM(bik bikVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return aI(bikVar, f, f2, f3, f4);
    }

    public static bik aN(bik bikVar, uiq uiqVar) {
        return bikVar.cM(new OffsetPxElement(uiqVar));
    }

    public static boolean aO(cib cibVar, aii aiiVar) {
        return cibVar != cib.b || aiiVar == aii.a;
    }

    public static apg aP(ayc aycVar) {
        float f = abn.a;
        chq chqVar = (chq) aycVar.e(bze.c);
        boolean zY = aycVar.y(chqVar.a());
        ayg aygVar = (ayg) aycVar;
        Object objR = aygVar.R();
        if (zY || objR == ayb.a) {
            objR = new ocq(new ocq(chqVar), (byte[]) null);
            aygVar.ac(objR);
        }
        ocq ocqVar = (ocq) objR;
        boolean zB = aycVar.B(ocqVar);
        Object objR2 = aygVar.R();
        if (zB || objR2 == ayb.a) {
            objR2 = new apg(ocqVar);
            aygVar.ac(objR2);
        }
        return (apg) objR2;
    }

    public static boolean aQ(KeyEvent keyEvent) {
        long jG = akg.G(keyEvent);
        return a.q(jG, bot.h) || a.q(jG, bot.k) || a.q(jG, bot.o) || a.q(jG, bot.j);
    }

    public static bik aR(bik bikVar, long j, blp blpVar) {
        return bikVar.cM(new BackgroundElement(j, blpVar));
    }

    public static long aT(ady adyVar) {
        return (adyVar.e() + adyVar.f()) * 1000000;
    }

    public static ace aU(adv advVar, ace aceVar, ace aceVar2, ace aceVar3) {
        return advVar.d(advVar.a(aceVar, aceVar2, aceVar3), aceVar, aceVar2, aceVar3);
    }

    public static float aV(uhf uhfVar) {
        bim bimVar = (bim) uhfVar.get(bim.a);
        float fA = bimVar != null ? bimVar.a() : 1.0f;
        if (fA < 0.0f) {
            acv.b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r27v1, types: [uiq] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object aW(final defpackage.abz r22, final defpackage.abv r23, long r24, final defpackage.uiq r26, defpackage.uhb r27) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.aW(abz, abv, long, uiq, uhb):java.lang.Object");
    }

    public static Object aX(abz abzVar, Object obj, aby abyVar, boolean z, uiq uiqVar, uhb uhbVar) {
        Object objAW = aW(abzVar, new adf(abyVar, abzVar.e, abzVar.a(), obj, abzVar.a), z ? abzVar.b : Long.MIN_VALUE, uiqVar, uhbVar);
        return objAW == uhi.a ? objAW : ufg.a;
    }

    public static void aY(abx abxVar, long j, float f, abv abvVar, abz abzVar, uiq uiqVar) {
        long jA = f == 0.0f ? abvVar.a() : (long) ((j - abxVar.b) / f);
        abxVar.e = j;
        abxVar.c.b(abvVar.d(jA));
        abxVar.d = abvVar.b(jA);
        if (abvVar.e(jA)) {
            abxVar.f = abxVar.e;
            abxVar.d();
        }
        aZ(abxVar, abzVar);
        uiqVar.a(abxVar);
    }

    public static void aZ(abx abxVar, abz abzVar) {
        abzVar.c(abxVar.a());
        ace aceVar = abzVar.a;
        ace aceVar2 = abxVar.d;
        int iB = aceVar.b();
        for (int i = 0; i < iB; i++) {
            aceVar.e(i, aceVar2.a(i));
        }
        abzVar.c = abxVar.f;
        abzVar.b = abxVar.e;
        abzVar.d = abxVar.c();
    }

    public static bbo aa(cwp cwpVar, ayc aycVar) {
        return ab(cwpVar, cwpVar.a(), aycVar);
    }

    public static bbo ab(cwp cwpVar, Object obj, ayc aycVar) {
        cwh cwhVar = (cwh) aycVar.e(cxu.a);
        Object objF = aycVar.f();
        Object obj2 = ayb.a;
        if (objF == obj2) {
            if (cwpVar.f != cwp.a) {
                obj = cwpVar.a();
            }
            Object azzVar = new azz(obj, bap.c);
            aycVar.w(azzVar);
            objF = azzVar;
        }
        azr azrVar = (azr) objF;
        boolean zD = aycVar.D(cwpVar) | aycVar.D(cwhVar);
        Object objF2 = aycVar.f();
        if (zD || objF2 == obj2) {
            objF2 = new bft(cwpVar, cwhVar, azrVar, 1);
            aycVar.w(objF2);
        }
        azb.b(cwpVar, cwhVar, (uiq) objF2, aycVar);
        return azrVar;
    }

    public static long ac() {
        return Thread.currentThread().getId();
    }

    public static int ad(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static Object[] ae(Object[] objArr, int i, Object obj, Object obj2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        rnt.aJ(objArr, objArr2, 0, i, 6);
        rnt.ay(objArr, objArr2, i + 2, i, length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static Object[] af(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        rnt.aJ(objArr, objArr2, 0, i, 6);
        rnt.ay(objArr, objArr2, i, i + 2, length);
        return objArr2;
    }

    public static Object[] ag(Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        rnt.aJ(objArr, objArr2, 0, i, 6);
        rnt.ay(objArr, objArr2, i, i + 1, length);
        return objArr2;
    }

    public static bbo ah(Object obj, ayc aycVar) {
        Object objF = aycVar.f();
        if (objF == ayb.a) {
            azz azzVar = new azz(obj, bap.c);
            aycVar.w(azzVar);
            objF = azzVar;
        }
        azr azrVar = (azr) objF;
        azrVar.b(obj);
        return azrVar;
    }

    public static urk ai(uif uifVar) {
        return new urd(new bbl(uifVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List aj(baz bazVar, int i, baz bazVar2, boolean z, boolean z2, boolean z3) {
        ufw ufwVar;
        boolean zT;
        int i2;
        int i3;
        int iJ = bazVar.j(i);
        int i4 = i + iJ;
        int iB = bazVar.b(i);
        int iB2 = bazVar.b(i4);
        int i5 = iB2 - iB;
        boolean z4 = i >= 0 && (bazVar.b[(bazVar.h(i) * 5) + 1] & 201326592) != 0;
        bazVar2.D(iJ);
        bazVar2.E(i5, bazVar2.o);
        if (bazVar.f < i4) {
            bazVar.F(i4);
        }
        if (bazVar.j < iB2) {
            bazVar.G(iB2, i4);
        }
        int[] iArr = bazVar2.b;
        int i6 = bazVar2.o;
        int i7 = i6 * 5;
        rnt.aw(bazVar.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = bazVar2.c;
        int i8 = bazVar2.h;
        System.arraycopy(bazVar.c, iB, objArr, i8, i5);
        int i9 = bazVar2.q;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iJ;
        int iC = i8 - bazVar2.c(iArr, i6);
        int i12 = bazVar2.l;
        int i13 = bazVar2.k;
        int length = objArr.length;
        boolean z5 = z4;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            int i16 = i15 * 5;
            if (i15 != i6) {
                int i17 = i16 + 2;
                iArr[i17] = iArr[i17] + i10;
            }
            int[] iArr2 = iArr;
            int iC2 = bazVar2.c(iArr, i15) + iC;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = bazVar2.j;
            }
            iArr2[i16 + 4] = baz.V(iC2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        bazVar2.l = i14;
        int iB3 = bay.b(bazVar.d, i, bazVar.f());
        int iB4 = bay.b(bazVar.d, i4, bazVar.f());
        if (iB3 < iB4) {
            ArrayList arrayList = bazVar.d;
            ArrayList arrayList2 = new ArrayList(iB4 - iB3);
            for (int i18 = iB3; i18 < iB4; i18++) {
                axq axqVar = (axq) arrayList.get(i18);
                axqVar.a += i10;
                arrayList2.add(axqVar);
            }
            bazVar2.d.addAll(bay.b(bazVar2.d, bazVar2.o, bazVar2.f()), arrayList2);
            arrayList.subList(iB3, iB4).clear();
            ufwVar = arrayList2;
        } else {
            ufwVar = ufw.a;
        }
        if (!ufwVar.isEmpty()) {
            HashMap map = bazVar.e;
            HashMap map2 = bazVar2.e;
            if (map != null && map2 != null) {
                int size = ufwVar.size();
                for (int i19 = 0; i19 < size; i19++) {
                    axq axqVar2 = (axq) ufwVar.get(i19);
                    bay bayVar = (bay) map.get(axqVar2);
                    if (bayVar != null) {
                        map.remove(axqVar2);
                        map2.put(axqVar2, bayVar);
                    }
                }
            }
        }
        int i20 = bazVar2.q;
        if (bazVar2.aa(i9) != null) {
            int iA = i20 + 1;
            int i21 = bazVar2.o;
            while (iA < i21) {
                iA += bay.a(bazVar2.b, iA);
            }
            throw null;
        }
        int iL = bazVar.l(i);
        if (z3) {
            if (z) {
                boolean z6 = iL >= 0;
                if (z6) {
                    bazVar.L();
                    bazVar.x(iL - bazVar.o);
                    bazVar.L();
                }
                bazVar.x(i - bazVar.o);
                zT = bazVar.T();
                if (z6) {
                    bazVar.J();
                    bazVar.W();
                    bazVar.J();
                    bazVar.W();
                }
            } else {
                boolean zU = bazVar.U(i, iJ);
                bazVar.I(iB, i5, i - 1);
                zT = zU;
            }
            if (zT) {
                ayi.i("Unexpectedly removed anchors");
            }
        }
        int i22 = bazVar2.n;
        int i23 = iArr3[i7 + 1];
        bazVar2.n = i22 + ((1073741824 & i23) != 0 ? 1 : i23 & 67108863);
        if (z2) {
            bazVar2.o = i11;
            bazVar2.h = i8 + i5;
        }
        if (z5) {
            bazVar2.P(i9);
        }
        return ufwVar;
    }

    public static /* synthetic */ void al(bmv bmvVar, long j, float f, float f2, long j2, long j3, byi byiVar, int i, int i2) {
        long j4 = (i2 & 16) != 0 ? 0L : j2;
        long jAc = (i2 & 32) != 0 ? a.ac(bmvVar.m(), j4) : j3;
        float f3 = (i2 & 64) != 0 ? 1.0f : 0.0f;
        byi byiVar2 = (i2 & 128) != 0 ? bmx.a : byiVar;
        int i3 = (i2 & 512) != 0 ? 3 : i;
        bmt bmtVar = ((bvo) bmvVar).a;
        long j5 = j4 >> 32;
        int i4 = (int) (j4 & 4294967295L);
        int i5 = (int) j5;
        bmtVar.a.c.r(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) + Float.intBitsToFloat((int) (jAc >> 32)), Float.intBitsToFloat(i4) + Float.intBitsToFloat((int) (jAc & 4294967295L)), f, f2, bmt.x(bmtVar, j, byiVar2, f3, null, i3));
    }

    public static /* synthetic */ void am(bmv bmvVar, long j, float f, long j2, byi byiVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = bki.a(bmvVar.m()) / 2.0f;
        }
        long jL = (i2 & 4) != 0 ? bmvVar.l() : j2;
        float f2 = (i2 & 8) != 0 ? 1.0f : 0.0f;
        byi byiVar2 = (i2 & 16) != 0 ? bmx.a : byiVar;
        int i3 = (i2 & 64) != 0 ? 3 : i;
        bmt bmtVar = ((bvo) bmvVar).a;
        bmtVar.a.c.m(jL, f, bmt.x(bmtVar, j, byiVar2, f2, null, i3));
    }

    public static /* synthetic */ void an(bmv bmvVar, bkn bknVar, bks bksVar, float f, byi byiVar, int i) {
        if ((i & 8) != 0) {
            byiVar = bmx.a;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        bmvVar.w(bknVar, bksVar, f, byiVar);
    }

    public static void ao(Object obj, int i, aos aosVar, uiu uiuVar, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(872548579);
        if (i4 == 0) {
            i3 = (true != aycVarC.D(obj) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.z(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.D(aosVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? 1024 : 2048;
        }
        if (aycVarC.H((i3 & 1171) != 1170, i3 & 1)) {
            boolean zB = aycVarC.B(obj) | aycVarC.B(aosVar);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new aoq(obj, aosVar);
                aygVar.ac(objR);
            }
            aoq aoqVar = (aoq) objR;
            aoqVar.b = i;
            aoq aoqVar2 = (aoq) aycVarC.e(btc.a);
            bgj bgjVarA = bay.A();
            uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgj bgjVarB = bay.B(bgjVarA);
            try {
                if (aoqVar2 != aoqVar.b()) {
                    aoqVar.e.b(aoqVar2);
                    if (aoqVar.c > 0) {
                        aoq aoqVar3 = aoqVar.f;
                        if (aoqVar3 != null) {
                            aoqVar3.a();
                        }
                        if (aoqVar2 != null) {
                            aoqVar2.c();
                        } else {
                            aoqVar2 = null;
                        }
                        aoqVar.f = aoqVar2;
                    }
                }
                bay.E(bgjVarA, bgjVarB, uiqVarI);
                boolean zB2 = aycVarC.B(aoqVar);
                Object objR2 = aygVar.R();
                if (zB2 || objR2 == ayb.a) {
                    objR2 = new np(aoqVar, 15);
                    aygVar.ac(objR2);
                }
                azb.c(aoqVar, (uiq) objR2, aycVarC);
                bay.K(btc.a.b(aoqVar), uiuVar, aycVarC, ((i3 >> 6) & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
            } catch (Throwable th) {
                bay.E(bgjVarA, bgjVarB, uiqVarI);
                throw th;
            }
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aor(obj, i, aosVar, uiuVar, i2, 0);
        }
    }

    public static /* synthetic */ ukv ap(int i) {
        int i2 = (i / 30) * 30;
        return ukc.u(Math.max(i2 - 100, 0), i2 + 130);
    }

    public static void aq(uif uifVar, bik bikVar, aov aovVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(2002163445);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(uifVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(aovVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 1024 : 2048;
        }
        if (aycVarC.H((i2 & 1171) != 1170, i2 & 1)) {
            bay.af(bdq.k(-1488997347, new aom(aovVar, bikVar, uiuVar, ah(uifVar, aycVarC)), aycVarC), aycVarC, 6);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dms(uifVar, bikVar, aovVar, uiuVar, i, 1);
        }
    }

    public static int ar(amt amtVar, Object obj, int i) {
        int iA;
        return (obj == null || amtVar.b() == 0 || (i < amtVar.b() && a.ao(obj, amtVar.d(i))) || (iA = amtVar.a(obj)) == -1) ? i : iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void as(amt amtVar, Object obj, int i, Object obj2, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1439843069);
        if (i4 == 0) {
            i3 = (true != aycVarC.B(amtVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.B(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.B(obj2) ? 1024 : 2048;
        }
        if (aycVarC.H((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, bdq.k(980966366, new aoi(amtVar, i, obj2), aycVarC), aycVarC, 48);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aor(amtVar, obj, i, obj2, i2, 1);
        }
    }

    public static void at() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    public static int au(bdp bdpVar, int i) {
        int i2 = bdpVar.b - 1;
        int i3 = 0;
        while (i3 < i2) {
            Object[] objArr = bdpVar.a;
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = ((ant) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ant) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void av(defpackage.bik r32, final defpackage.ank r33, final defpackage.alv r34, final boolean r35, final defpackage.apg r36, final boolean r37, final defpackage.afy r38, defpackage.bic r39, defpackage.akp r40, defpackage.bid r41, defpackage.akk r42, final defpackage.uiq r43, defpackage.ayc r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.av(bik, ank, alv, boolean, apg, boolean, afy, bic, akp, bid, akk, uiq, ayc, int, int, int):void");
    }

    public static WrapContentElement aw(bie bieVar) {
        return new WrapContentElement(new aml(bieVar, 0), bieVar);
    }

    public static void ax(bik bikVar, ank ankVar, alv alvVar, akp akpVar, bic bicVar, apg apgVar, boolean z, afy afyVar, uiq uiqVar, ayc aycVar, int i, int i2) {
        bik bikVar2;
        int i3;
        akp akpVar2;
        bic bicVar2;
        apg apgVar2;
        boolean z2;
        afy afyVar2;
        uiq uiqVar2;
        ayc aycVar2;
        ayc aycVarC = aycVar.c(53695811);
        if ((i & 6) == 0) {
            bikVar2 = bikVar;
            i3 = (true != aycVarC.B(bikVar2) ? 2 : 4) | i;
        } else {
            bikVar2 = bikVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= aycVarC.B(ankVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.B(alvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != aycVarC.C(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            akpVar2 = akpVar;
            i3 |= aycVarC.B(akpVar2) ? 16384 : 8192;
        } else {
            akpVar2 = akpVar;
        }
        if ((196608 & i) == 0) {
            bicVar2 = bicVar;
            i3 |= true != aycVarC.B(bicVar2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            bicVar2 = bicVar;
        }
        if ((1572864 & i) == 0) {
            apgVar2 = apgVar;
            i3 |= aycVarC.B(apgVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        } else {
            apgVar2 = apgVar;
        }
        if ((12582912 & i) == 0) {
            z2 = z;
            i3 |= true != aycVarC.C(z2) ? 4194304 : 8388608;
        } else {
            z2 = z;
        }
        if ((100663296 & i) == 0) {
            afyVar2 = afyVar;
            i3 |= aycVarC.B(afyVar2) ? 67108864 : 33554432;
        } else {
            afyVar2 = afyVar;
        }
        if ((805306368 & i) == 0) {
            uiqVar2 = uiqVar;
            i3 |= true != aycVarC.D(uiqVar2) ? 268435456 : 536870912;
        } else {
            uiqVar2 = uiqVar;
        }
        if (aycVarC.H((306783379 & i3) != 306783378, i3 & 1)) {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            int i4 = i3 & 7168;
            int i5 = i3 >> 3;
            aycVar2 = aycVarC;
            apg apgVar3 = apgVar2;
            boolean z3 = z2;
            afy afyVar3 = afyVar2;
            av(bikVar2, ankVar, alvVar, true, apgVar3, z3, afyVar3, bicVar2, akpVar2, null, null, uiqVar2, aycVar2, (i3 & 14) | 24576 | (i3 & ScriptIntrinsicBLAS.TRANSPOSE) | (i3 & 896) | i4 | (i5 & ImageMetadata.JPEG_GPS_COORDINATES) | (i5 & 3670016) | (i5 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
        } else {
            aycVar2 = aycVarC;
            aycVar2.r();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new amq(bikVar, ankVar, alvVar, akpVar, bicVar, apgVar, z, afyVar, uiqVar, i, 0, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ay(defpackage.bik r28, defpackage.ank r29, defpackage.alv r30, defpackage.akk r31, defpackage.bid r32, defpackage.apg r33, boolean r34, defpackage.afy r35, defpackage.uiq r36, defpackage.ayc r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.ay(bik, ank, alv, akk, bid, apg, boolean, afy, uiq, ayc, int, int):void");
    }

    public static /* synthetic */ bss az(aly alyVar, int i, int i2, int i3, int i4, int i5, bst bstVar, List list, bte[] bteVarArr, int i6) {
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        int i11;
        int i12 = i3;
        int i13 = i4;
        int[] iArr = new int[i6];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        int iMax = 0;
        float f2 = 0.0f;
        while (true) {
            i7 = Integer.MAX_VALUE;
            if (i14 >= i6) {
                break;
            }
            bsq bsqVar = (bsq) list.get(i14);
            float fAA = aA(aB(bsqVar));
            if (fAA > 0.0f) {
                f2 += fAA;
                i15++;
                i10 = i14;
            } else {
                int i17 = i12 - i16;
                int i18 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13;
                bte bteVarR = bteVarArr[i14];
                if (bteVarR != null) {
                    i10 = i14;
                    i11 = i15;
                } else if (i12 == Integer.MAX_VALUE) {
                    i10 = i14;
                    int i19 = i18;
                    i11 = i15;
                    bteVarR = bsqVar.r(alyVar.i(0, i7, i19, false));
                } else if (i17 < 0) {
                    i7 = 0;
                    i10 = i14;
                    int i192 = i18;
                    i11 = i15;
                    bteVarR = bsqVar.r(alyVar.i(0, i7, i192, false));
                } else {
                    i10 = i14;
                    i7 = i17;
                    int i1922 = i18;
                    i11 = i15;
                    bteVarR = bsqVar.r(alyVar.i(0, i7, i1922, false));
                }
                bte bteVar = bteVarR;
                int iG = alyVar.g(bteVar);
                int iF = alyVar.f(bteVar);
                iArr[i10] = iG;
                int i20 = i17 - iG;
                if (i20 < 0) {
                    i20 = 0;
                }
                iMin = Math.min(i5, i20);
                i16 += iG + iMin;
                iMax = Math.max(iMax, iF);
                bteVarArr[i10] = bteVar;
                i15 = i11;
            }
            i14 = i10 + 1;
        }
        if (i15 == 0) {
            i16 -= iMin;
            i8 = 0;
        } else {
            int i21 = i12 - i16;
            long j = i5;
            if (i12 == Integer.MAX_VALUE) {
                i12 = i;
            }
            long j2 = j * (r19 - 1);
            long jRound = (i12 - i16) - j2;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i22 = 0; i22 < i6; i22++) {
                jRound -= Math.round(aA(aB((bsq) list.get(i22))) * f3);
            }
            int i23 = 0;
            int i24 = 0;
            while (i23 < i6) {
                if (bteVarArr[i23] == null) {
                    bsq bsqVar2 = (bsq) list.get(i23);
                    f = f3;
                    alz alzVarAB = aB(bsqVar2);
                    float fAA2 = aA(alzVarAB);
                    int i25 = i13 == i7 ? i7 : i13;
                    if (fAA2 <= 0.0f) {
                        amo.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    i9 = i23;
                    jRound -= iSignum;
                    int iMax2 = Math.max(0, Math.round(f * fAA2) + iSignum);
                    bte bteVarR2 = bsqVar2.r(alyVar.i(((alzVarAB == null || alzVarAB.b) && iMax2 != Integer.MAX_VALUE) ? iMax2 : 0, iMax2, i25, true));
                    int iG2 = alyVar.g(bteVarR2);
                    int iF2 = alyVar.f(bteVarR2);
                    iArr[i9] = iG2;
                    i24 += iG2;
                    iMax = Math.max(iMax, iF2);
                    bteVarArr[i9] = bteVarR2;
                } else {
                    f = f3;
                    i9 = i23;
                }
                i23 = i9 + 1;
                i13 = i4;
                f3 = f;
                i7 = Integer.MAX_VALUE;
            }
            int i26 = (int) (i24 + j2);
            if (i26 < 0) {
                i26 = 0;
            }
            i8 = i26 > i21 ? i21 : i26;
        }
        int i27 = i16 + i8;
        if (i27 < 0) {
            i27 = 0;
        }
        int iMax3 = Math.max(i27, i);
        int iMax4 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        alyVar.h(iMax3, iArr, iArr2, bstVar);
        return alyVar.j(bteVarArr, bstVar, iArr2, iMax3, iMax4);
    }

    public static void bA(CaptureRequest.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            bz(builder, entry.getKey(), entry.getValue());
        }
    }

    public static qs bB(Size size, int i, String str, qv qvVar, qt qtVar, qx qxVar, qy qyVar, List list) {
        if (a.ao(qvVar, qv.c) || a.ao(qvVar, qv.b)) {
            return new qr(size, i, str, qvVar, qtVar, qxVar, qyVar, list);
        }
        if (a.ao(qvVar, qv.a)) {
            return new qs(size, i, str, null, null, qtVar, qxVar, qyVar, list);
        }
        throw new IllegalStateException("Check failed.");
    }

    public static qm bC(String str) {
        Set set = qm.a;
        synchronized (set) {
            if (!set.add(str)) {
                throw new IllegalStateException(str + " is already defined!");
            }
        }
        return new qm(str);
    }

    public static boolean bD(sm smVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) smVar.a(key);
        return num != null && num.intValue() == 2;
    }

    public static void bE(View view, nv nvVar) {
        view.getClass();
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, nvVar);
    }

    public static boolean bF(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static Drawable bJ(Context context, int i) {
        return lj.e().c(context, i);
    }

    public static /* synthetic */ bik bK(bik bikVar, ocq ocqVar, afn afnVar, boolean z, cbk cbkVar, uif uifVar, int i) {
        boolean z2 = (!((i & 4) == 0)) | z;
        if ((i & 16) != 0) {
            cbkVar = null;
        }
        cbk cbkVar2 = cbkVar;
        return bikVar.cM(afnVar instanceof afr ? new ClickableElement(ocqVar, (afr) afnVar, false, z2, null, cbkVar2, uifVar) : afnVar == null ? new ClickableElement(ocqVar, null, false, z2, null, cbkVar2, uifVar) : ocqVar != null ? afo.a(bik.c, ocqVar, afnVar).cM(new ClickableElement(ocqVar, null, false, z2, null, cbkVar2, uifVar)) : bay.x(bik.c, new aev(afnVar, z2, cbkVar2, uifVar, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bik bL(bik bikVar, ocq ocqVar, afn afnVar, boolean z, cbk cbkVar, uif uifVar, int i) {
        bik combinedClickableElement;
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 16) != 0) {
            cbkVar = null;
        }
        if (afnVar instanceof afr) {
            combinedClickableElement = new CombinedClickableElement(ocqVar, afnVar, z2, cbkVar, uifVar);
        } else {
            cbk cbkVar2 = cbkVar;
            combinedClickableElement = afnVar == 0 ? new CombinedClickableElement(ocqVar, null, z2, cbkVar2, uifVar) : ocqVar != null ? afo.a(bik.c, ocqVar, afnVar).cM(new CombinedClickableElement(ocqVar, null, z2, cbkVar2, uifVar)) : bay.x(bik.c, new aev(afnVar, z2, cbkVar2, uifVar, 0));
        }
        return bikVar.cM(combinedClickableElement);
    }

    public static float bM(ocq ocqVar, float f, float f2) {
        return ((aca) ocqVar.aH().a(new aca(f), new aca(f2))).a;
    }

    public static ocq bN(chq chqVar) {
        return new ocq(new ocq(chqVar), (byte[]) null);
    }

    public static ocq bO(qs qsVar) {
        return new ocq(ske.bj(qsVar));
    }

    public static /* synthetic */ ocq bP(Size size, int i, String str, qt qtVar, qx qxVar, qy qyVar, List list, int i2) {
        qv qvVar = (i2 & 8) != 0 ? qv.a : null;
        if ((i2 & 64) != 0) {
            qtVar = null;
        }
        if ((i2 & 128) != 0) {
            qxVar = null;
        }
        if ((i2 & 256) != 0) {
            qyVar = null;
        }
        if ((i2 & 512) != 0) {
            list = ufw.a;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        qvVar.getClass();
        list.getClass();
        List list2 = list;
        return bO(bB(size, i, str, qvVar, qtVar, qxVar, qyVar, list2));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, uiq] */
    public static /* synthetic */ Object ba(float f, float f2, aby abyVar, uiu uiuVar, uhb uhbVar, int i) {
        byte[] bArr = null;
        if ((i & 8) != 0) {
            abyVar = bf(0.0f, 0.0f, null, 7);
        }
        aby abyVar2 = abyVar;
        byz byzVar = adu.a;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        ?? r9 = byzVar.a;
        ace aceVarC = (ace) r9.a(f5);
        if (aceVarC == null) {
            aceVarC = ((ace) r9.a(f3)).c();
        }
        ace aceVar = aceVarC;
        Object objAW = aW(new abz(byzVar, f3, aceVar, 56), new adf(abyVar2, byzVar, f3, f4, aceVar), Long.MIN_VALUE, new aff(uiuVar, byzVar, 1, bArr), uhbVar);
        uhi uhiVar = uhi.a;
        if (objAW != uhiVar) {
            objAW = ufg.a;
        }
        return objAW == uhiVar ? objAW : ufg.a;
    }

    public static /* synthetic */ Object bb(abz abzVar, Object obj, aby abyVar, boolean z, uiq uiqVar, uhb uhbVar, int i) {
        if ((i & 2) != 0) {
            abyVar = bf(0.0f, 0.0f, null, 7);
        }
        aby abyVar2 = abyVar;
        int i2 = 0;
        boolean z2 = ((i & 4) == 0) & z;
        if ((i & 8) != 0) {
            uiqVar = new add(i2);
        }
        return aX(abzVar, obj, abyVar2, z2, uiqVar, uhbVar);
    }

    public static ace bc(ace aceVar) {
        ace aceVarC = aceVar.c();
        int iB = aceVarC.b();
        for (int i = 0; i < iB; i++) {
            aceVarC.e(i, aceVar.a(i));
        }
        return aceVarC;
    }

    public static /* synthetic */ abz bd(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new abz(adu.a, Float.valueOf(0.0f), new aca(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ abz be(abz abzVar, float f) {
        float f2 = ((aca) abzVar.a).a;
        long j = abzVar.b;
        long j2 = abzVar.c;
        boolean z = abzVar.d;
        return new abz(abzVar.e, Float.valueOf(f), new aca(f2), j, j2, z);
    }

    public static /* synthetic */ acy bf(float f, float f2, Object obj, int i) {
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new acy(f, f2, obj);
    }

    public static /* synthetic */ adt bg(int i, int i2, ack ackVar, int i3) {
        if ((i3 & 4) != 0) {
            ackVar = acm.a;
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            i2 = 0;
        }
        if (1 == i5) {
            i = 300;
        }
        return new adt(i, i2, ackVar);
    }

    public static boolean bh(abv abvVar, long j) {
        return j >= abvVar.a();
    }

    public static boolean bi(long j) {
        return !a.q(j, -9223372034707292160L);
    }

    public static /* synthetic */ bik bj(bik bikVar) {
        Map map = aef.a;
        return bdq.D(bikVar).cM(new SizeAnimationModifierElement(bf(0.0f, 400.0f, new cia(4294967297L), 1), bib.f));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    public static ace bl(byz byzVar, Object obj) {
        ace aceVar = (ace) byzVar.a.a(obj);
        aceVar.d();
        return aceVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void bm(boolean r16, defpackage.bik r17, defpackage.aaz r18, defpackage.aba r19, java.lang.String r20, defpackage.uiv r21, defpackage.ayc r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.bm(boolean, bik, aaz, aba, java.lang.String, uiv, ayc, int, int):void");
    }

    public static void bn(ado adoVar, uiq uiqVar, bik bikVar, aaz aazVar, aba abaVar, uiv uivVar, ayc aycVar, int i) {
        int i2;
        aaz aazVar2;
        aba abaVar2;
        uiv uivVar2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1706321816);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(adoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aazVar2 = aazVar;
            i2 |= true != aycVarC.B(aazVar2) ? 1024 : 2048;
        } else {
            aazVar2 = aazVar;
        }
        if ((i & 24576) == 0) {
            abaVar2 = abaVar;
            i2 |= true != aycVarC.B(abaVar2) ? 8192 : 16384;
        } else {
            abaVar2 = abaVar;
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
            uivVar2 = uivVar;
            i2 |= true != aycVarC.D(uivVar2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            uivVar2 = uivVar;
        }
        if (aycVarC.H((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 & ScriptIntrinsicBLAS.TRANSPOSE;
            boolean z = i4 == 32;
            int i5 = i2 & 14;
            boolean z2 = i5 == 4;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((z2 | z) || objR == ayb.a) {
                objR = new aam(uiqVar, adoVar);
                aygVar.ac(objR);
            }
            bik bikVarR = r(bikVar, (uiv) objR);
            Object objR2 = aygVar.R();
            if (objR2 == ayb.a) {
                objR2 = brg.b;
                aygVar.ac(objR2);
            }
            int i6 = i5 | ImageMetadata.EDGE_MODE;
            int i7 = 57344 & i2;
            int i8 = ((i2 << 6) & 29360128) | i6 | i4 | (i2 & 7168) | i7;
            bp(adoVar, uiqVar, bikVarR, aazVar2, abaVar2, (uiu) objR2, uivVar2, aycVarC, i8);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aan(adoVar, uiqVar, bikVar, aazVar, abaVar, uivVar, i);
        }
    }

    public static boolean bo(ado adoVar) {
        Object objD = adoVar.d();
        aar aarVar = aar.c;
        return objD == aarVar && adoVar.e() == aarVar;
    }

    public static void bp(ado adoVar, uiq uiqVar, bik bikVar, aaz aazVar, aba abaVar, uiu uiuVar, uiv uivVar, ayc aycVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        adi adiVar;
        adh adhVarA;
        ayc aycVarC = aycVar.c(1912839215);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.B(adoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(aazVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.B(abaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        int i5 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= true != aycVarC.D(uivVar) ? 4194304 : 8388608;
        }
        if (!aycVarC.H((4793491 & i5) != 4793490, i5 & 1)) {
            aycVarC.r();
        } else if (((Boolean) uiqVar.a(adoVar.e())).booleanValue() || ((Boolean) uiqVar.a(adoVar.d())).booleanValue() || adoVar.r() || adoVar.p()) {
            aycVarC.u(-232313409);
            int i6 = i5 & 14;
            int i7 = i6 | 48;
            int i8 = i7 & 14;
            boolean z2 = ((i8 ^ 6) > 4 && aycVarC.B(adoVar)) || (i7 & 6) == 4;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (z2 || objR == ayb.a) {
                objR = adoVar.d();
                aygVar.ac(objR);
            }
            if (adoVar.r()) {
                objR = adoVar.d();
            }
            aycVarC.u(1844425648);
            aar aarVarI = i(adoVar, uiqVar, objR, aycVarC);
            aygVar.Y();
            Object objE = adoVar.e();
            aycVarC.u(1844425648);
            aar aarVarI2 = i(adoVar, uiqVar, objE, aycVarC);
            aygVar.Y();
            int i9 = i8 | 3072;
            int i10 = (i9 & 14) ^ 6;
            int i11 = ads.a;
            boolean z3 = (i10 > 4 && aycVarC.B(adoVar)) || (i9 & 6) == 4;
            Object objR2 = aygVar.R();
            if (z3 || objR2 == ayb.a) {
                i3 = i5;
                i4 = i9;
                objR2 = new ado(new byz(aarVarI), adoVar, adoVar.a.concat(" > EnterExitTransition"));
                aygVar.ac(objR2);
            } else {
                i3 = i5;
                i4 = i9;
            }
            ado adoVar2 = (ado) objR2;
            boolean zB = ((i10 > 4 && aycVarC.B(adoVar)) || (i4 & 6) == 4) | aycVarC.B(adoVar2);
            Object objR3 = aygVar.R();
            if (zB || objR3 == ayb.a) {
                z = false;
                objR3 = new adp(adoVar, adoVar2, 0 == true ? 1 : 0);
                aygVar.ac(objR3);
            } else {
                z = false;
            }
            azb.c(adoVar2, (uiq) objR3, aycVarC);
            if (adoVar.r()) {
                adoVar2.t(aarVarI, aarVarI2);
            } else {
                adoVar2.o(aarVarI2);
                adoVar2.k(z);
            }
            bbo bboVarAh = ah(uiuVar, aycVarC);
            Object objA = uiuVar.a(adoVar2.d(), adoVar2.e());
            boolean zB2 = aycVarC.B(adoVar2) | aycVarC.B(bboVarAh);
            Object objR4 = aygVar.R();
            if (zB2 || objR4 == ayb.a) {
                objR4 = new duw(adoVar2, bboVarAh, (uhb) null, 1);
                aygVar.ac(objR4);
            }
            uiu uiuVar2 = (uiu) objR4;
            Object objR5 = aygVar.R();
            Object obj = ayb.a;
            if (objR5 == obj) {
                azz azzVar = new azz(objA, bap.c);
                aygVar.ac(azzVar);
                objR5 = azzVar;
            }
            azr azrVar = (azr) objR5;
            ufg ufgVar = ufg.a;
            boolean zD = aycVarC.D(uiuVar2);
            Object objR6 = aygVar.R();
            if (zD || objR6 == obj) {
                objR6 = new bbk(uiuVar2, azrVar, (uhb) null, 0);
                aygVar.ac(objR6);
            }
            azb.f(ufgVar, (uiu) objR6, aycVarC);
            if (bo(adoVar2) && ((Boolean) azrVar.a()).booleanValue()) {
                aycVarC.u(-230147501);
                aygVar.Y();
            } else {
                aycVarC.u(-231284364);
                Object objR7 = aygVar.R();
                if (i6 == 4 || objR7 == obj) {
                    objR7 = new ocq((byte[]) null, (short[]) null, (byte[]) null);
                    aygVar.ac(objR7);
                }
                ocq ocqVar = (ocq) objR7;
                acy acyVar = aav.a;
                Object objR8 = aygVar.R();
                if (objR8 == obj) {
                    objR8 = bnk.b;
                    aygVar.ac(objR8);
                }
                uif uifVar = (uif) objR8;
                boolean zB3 = aycVarC.B(adoVar2);
                Object objR9 = aygVar.R();
                if (zB3 || objR9 == obj) {
                    objR9 = new azz(aazVar, bap.c);
                    aygVar.ac(objR9);
                }
                azr azrVar2 = (azr) objR9;
                if (adoVar2.d() == adoVar2.e() && adoVar2.d() == aar.b) {
                    if (adoVar2.r()) {
                        aav.c(azrVar2, aazVar);
                    } else {
                        aav.c(azrVar2, aaz.a);
                    }
                } else if (adoVar2.e() == aar.b) {
                    aaz aazVarA = aav.a(azrVar2);
                    abo aboVar = aazVar.b;
                    abb abbVar = aboVar.a;
                    if (abbVar == null) {
                        abbVar = aazVarA.b.a;
                    }
                    aav.c(azrVar2, new aaz(new abo(abbVar, false, ske.bd(aazVarA.b.d, aboVar.d), 16)));
                }
                aaz aazVarA2 = aav.a(azrVar2);
                boolean zB4 = aycVarC.B(adoVar2);
                Object objR10 = aygVar.R();
                if (zB4 || objR10 == obj) {
                    objR10 = new azz(abaVar, bap.c);
                    aygVar.ac(objR10);
                }
                azr azrVar3 = (azr) objR10;
                if (adoVar2.d() == adoVar2.e() && adoVar2.d() == aar.b) {
                    if (adoVar2.r()) {
                        aav.d(azrVar3, abaVar);
                    } else {
                        aav.d(azrVar3, aba.a);
                    }
                } else if (adoVar2.e() != aar.b) {
                    aba abaVarB = aav.b(azrVar3);
                    abo aboVar2 = abaVar.b;
                    abb abbVar2 = aboVar2.a;
                    if (abbVar2 == null) {
                        abbVar2 = abaVarB.b.a;
                    }
                    abo aboVar3 = abaVarB.b;
                    aav.d(azrVar3, new aba(new abo(abbVar2, aboVar2.c || aboVar3.c, ske.bd(aboVar3.d, aboVar2.d))));
                }
                aba abaVarB2 = aav.b(azrVar3);
                abo aboVar4 = aazVarA2.b;
                abo aboVar5 = abaVarB2.b;
                aycVarC.u(133943088);
                aygVar.Y();
                aycVarC.u(134145703);
                aygVar.Y();
                aycVarC.u(134388743);
                aygVar.Y();
                if (aboVar4.a == null && aboVar5.a == null) {
                    aycVarC.u(-703692120);
                    aygVar.Y();
                    adiVar = null;
                } else {
                    aycVarC.u(-703860604);
                    byz byzVar = adu.a;
                    Object objR11 = aygVar.R();
                    if (objR11 == obj) {
                        objR11 = "Built-in alpha";
                        aygVar.ac("Built-in alpha");
                    }
                    boolean zB5 = aycVarC.B(adoVar2);
                    Object objR12 = aygVar.R();
                    if (zB5 || objR12 == obj) {
                        objR12 = new adi(adoVar2, byzVar);
                        aygVar.ac(objR12);
                    }
                    adiVar = (adi) objR12;
                    boolean zB6 = aycVarC.B(adoVar2) | aycVarC.D(adiVar);
                    Object objR13 = aygVar.R();
                    if (zB6 || objR13 == obj) {
                        objR13 = new adp(adoVar2, adiVar, 2, null);
                        aygVar.ac(objR13);
                    }
                    azb.c(adiVar, (uiq) objR13, aycVarC);
                    if (adoVar2.r() && (adhVarA = adiVar.a()) != null) {
                        ado adoVar3 = adiVar.b;
                        adhVarA.a.n(adhVarA.c.a(adoVar3.s().a), adhVarA.c.a(adoVar3.s().b), (acn) adhVarA.b.a(adoVar3.s()));
                    }
                    aygVar.Y();
                }
                aycVarC.u(-703456024);
                aygVar.Y();
                aycVarC.u(-703207032);
                aygVar.Y();
                boolean zD2 = aycVarC.D(adiVar) | aycVarC.B(aazVarA2) | aycVarC.B(abaVarB2) | aycVarC.D(null) | aycVarC.B(adoVar2) | aycVarC.D(null);
                Object objR14 = aygVar.R();
                if (zD2 || objR14 == obj) {
                    objR14 = new aas(adiVar, adoVar2, aazVarA2, abaVarB2);
                    aygVar.ac(objR14);
                }
                aas aasVar = (aas) objR14;
                bih bihVar = bik.c;
                boolean zC = aycVarC.C(true) | aycVarC.B(uifVar);
                Object objR15 = aygVar.R();
                if (zC || objR15 == obj) {
                    objR15 = new aau(0);
                    aygVar.ac(objR15);
                }
                bik bikVarCM = bko.c(bihVar, (uiq) objR15).cM(new EnterExitTransitionElement(adoVar2, aazVarA2, abaVarB2, uifVar, aasVar));
                aycVarC.u(-7429481);
                aygVar.Y();
                bik bikVarCM2 = bikVar.cM(bikVarCM.cM(bihVar));
                Object objR16 = aygVar.R();
                if (objR16 == obj) {
                    objR16 = new aah(ocqVar);
                    aygVar.ac(objR16);
                }
                aah aahVar = (aah) objR16;
                int iR = a.r(bay.N(aycVarC));
                bfk bfkVarAg = aygVar.ag();
                bik bikVarV = bay.v(aycVarC, bikVarCM2);
                uif uifVar2 = bum.a;
                aycVarC.v();
                if (aygVar.v) {
                    aycVarC.j(uifVar2);
                } else {
                    aycVarC.x();
                }
                bbr.a(aycVarC, aahVar, bum.d);
                bbr.a(aycVarC, bfkVarAg, bum.c);
                uiu uiuVar3 = bum.e;
                if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                    Object objValueOf = Integer.valueOf(iR);
                    aygVar.ac(objValueOf);
                    aycVarC.h(objValueOf, uiuVar3);
                }
                bbr.a(aycVarC, bikVarV, bum.b);
                uivVar.a(ocqVar, aycVarC, Integer.valueOf((i3 >> 18) & ScriptIntrinsicBLAS.TRANSPOSE));
                aycVarC.m();
                aygVar.Y();
            }
            aygVar.Y();
        } else {
            aycVarC.u(-230141549);
            ((ayg) aycVarC).Y();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aai(adoVar, uiqVar, bikVar, aazVar, abaVar, uiuVar, uivVar, i);
        }
    }

    public static int bq(yf yfVar, int i) {
        try {
            return aae.a(yfVar.a, yfVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int br(yf yfVar, Object obj, int i) {
        int i2 = yfVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iBq = bq(yfVar, i);
        if (iBq < 0 || a.ao(obj, yfVar.b[iBq])) {
            return iBq;
        }
        int i3 = iBq + 1;
        while (i3 < i2 && yfVar.a[i3] == i) {
            if (a.ao(obj, yfVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBq - 1; i4 >= 0 && yfVar.a[i4] == i; i4--) {
            if (a.ao(obj, yfVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static int bs(yf yfVar) {
        return br(yfVar, null, 0);
    }

    public static void bt(yf yfVar, int i) {
        yfVar.a = new int[i];
        yfVar.b = new Object[i];
    }

    public static void bu(StringBuilder sb, String str, Map map) {
        String strValueOf;
        String strValueOf2;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str + '\n');
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                strValueOf = ((CameraCharacteristics.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                strValueOf = ((CaptureRequest.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                strValueOf = ((CaptureResult.Key) key).getName();
                strValueOf.getClass();
            } else {
                strValueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            if (value instanceof MeteringRectangle) {
                StringBuilder sb2 = new StringBuilder("[x=");
                MeteringRectangle meteringRectangle = (MeteringRectangle) value;
                sb2.append(meteringRectangle.getX());
                sb2.append(", y=");
                sb2.append(meteringRectangle.getY());
                sb2.append(", w=");
                sb2.append(meteringRectangle.getWidth());
                sb2.append(", h=");
                sb2.append(meteringRectangle.getHeight());
                sb2.append(", weight=");
                sb2.append(meteringRectangle.getMeteringWeight());
                strValueOf2 = sb2.toString();
            } else {
                strValueOf2 = String.valueOf(value);
            }
            arrayList.add(new uev(strValueOf, strValueOf2));
        }
        for (uev uevVar : ske.bM(arrayList, new wp(1))) {
            sb.append("  " + ujp.w((String) uevVar.a, 50) + ' ' + ((String) uevVar.b) + '\n');
        }
    }

    public static /* synthetic */ String bv(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "CLOSING" : "CREATED" : "CREATING" : "PENDING";
    }

    public static tv bw(pl plVar, wq wqVar, Map map) {
        int i;
        Iterator it;
        List listBj;
        pl plVar2 = plVar;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = wqVar.h.iterator();
        while (it2.hasNext()) {
            wn wnVar = (wn) it2.next();
            List list = wnVar.m;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Surface surface = (Surface) map.get(new rh(((pv) it3.next()).a));
                if (surface != null) {
                    arrayList2.add(surface);
                }
            }
            OutputConfiguration outputConfiguration = wnVar.e;
            if (outputConfiguration == null) {
                if (wnVar.a()) {
                    i = -1;
                    if (arrayList2.size() != list.size()) {
                        Size size = wnVar.a;
                        qv qvVar = wnVar.f;
                        qvVar.getClass();
                        qu quVar = wnVar.g;
                        qz qzVar = wnVar.h;
                        qt qtVar = wnVar.i;
                        qx qxVar = wnVar.j;
                        List list2 = wnVar.l;
                        boolean zB = wnVar.b();
                        it = it2;
                        Integer num = wnVar.d;
                        int iIntValue = num != null ? num.intValue() : -1;
                        String str = wnVar.c;
                        sa saVarBy = by(null, qvVar, quVar, qzVar, qtVar, qxVar, list2, size, zB, iIntValue, true == a.ao(str, plVar2.a) ? null : str);
                        if (saVarBy == null) {
                            Objects.toString(wnVar);
                            Log.w("CXCP", "Failed to create AndroidOutputConfiguration for ".concat(String.valueOf(wnVar)));
                        } else {
                            arrayList.add(saVarBy);
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                linkedHashMap.put(new rh(((pv) it4.next()).a), saVarBy);
                            }
                        }
                    }
                    it2 = it;
                } else {
                    i = -1;
                }
                it = it2;
                if (arrayList2.size() != list.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (!map.containsKey(new rh(((pv) obj).a))) {
                            arrayList3.add(obj);
                        }
                    }
                    throw new IllegalStateException(mn.e((byte) 33, arrayList3, wnVar, "Surfaces are not yet available for ", "! Missing surfaces for "));
                }
                Surface surface2 = (Surface) ske.bB(arrayList2);
                qu quVar2 = wnVar.g;
                qz qzVar2 = wnVar.h;
                qt qtVar2 = wnVar.i;
                qx qxVar2 = wnVar.j;
                List list3 = wnVar.l;
                Size size2 = wnVar.a;
                boolean zB2 = wnVar.b();
                Integer num2 = wnVar.d;
                int iIntValue2 = num2 != null ? num2.intValue() : i;
                String str2 = wnVar.c;
                sa saVarBy2 = by(surface2, qv.a, quVar2, qzVar2, qtVar2, qxVar2, list3, size2, zB2, iIntValue2, true == a.ao(str2, plVar2.a) ? null : str2);
                if (saVarBy2 == null) {
                    Objects.toString(wnVar);
                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for ".concat(String.valueOf(wnVar)));
                } else {
                    int size3 = arrayList2.size() - 1;
                    if (size3 <= 0) {
                        listBj = ufw.a;
                    } else if (size3 == 1) {
                        listBj = ske.bj(ske.bF(arrayList2));
                    } else {
                        ArrayList arrayList4 = new ArrayList(size3);
                        int size4 = arrayList2.size();
                        for (int i2 = 1; i2 < size4; i2++) {
                            arrayList4.add(arrayList2.get(i2));
                        }
                        listBj = arrayList4;
                    }
                    Iterator it5 = listBj.iterator();
                    while (it5.hasNext()) {
                        saVarBy2.a((Surface) it5.next());
                    }
                    arrayList.add(saVarBy2);
                }
                plVar2 = plVar;
                it2 = it;
            } else {
                if (arrayList2.size() != list.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!map.containsKey(new rh(((pv) obj2).a))) {
                            arrayList5.add(obj2);
                        }
                    }
                    throw new IllegalStateException(mn.e((byte) 33, arrayList5, wnVar, "Surfaces are not yet available for ", "! Missing surfaces for "));
                }
                arrayList.add(new sa(outputConfiguration));
            }
        }
        return new tv(arrayList, linkedHashMap);
    }

    public static void bx(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        executor.getClass();
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static sa by(Surface surface, qv qvVar, qu quVar, qz qzVar, qt qtVar, qx qxVar, List list, Size size, boolean z, int i, String str) {
        Class cls;
        OutputConfiguration outputConfiguration;
        qv qvVar2 = qv.a;
        if (!a.ao(qvVar, qvVar2)) {
            if (a.ao(qvVar, qv.c)) {
                cls = SurfaceTexture.class;
            } else {
                if (!a.ao(qvVar, qv.b)) {
                    Objects.toString(qvVar);
                    throw new IllegalStateException("Unsupported OutputType: ".concat(qvVar.toString()));
                }
                cls = SurfaceHolder.class;
            }
            outputConfiguration = new OutputConfiguration(size, cls);
        } else {
            if (surface == null) {
                Objects.toString(qvVar2);
                throw new IllegalStateException("non-null surface!");
            }
            try {
                outputConfiguration = i != -1 ? new OutputConfiguration(i, surface) : new OutputConfiguration(surface);
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface + '!', th);
                return null;
            }
        }
        if (z) {
            outputConfiguration.enableSurfaceSharing();
        }
        if (str != null) {
            outputConfiguration.setPhysicalCameraId(str);
        }
        if (quVar != null) {
            outputConfiguration.setMirrorMode(quVar.a);
        }
        if (qzVar != null) {
            outputConfiguration.setTimestampBase(qzVar.a);
        }
        if (qtVar != null) {
            outputConfiguration.setDynamicRangeProfile(qtVar.a);
        }
        if (qxVar != null) {
            outputConfiguration.setStreamUseCase(qxVar.a);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                outputConfiguration.addSensorPixelModeUsed(((qw) it.next()).a);
            }
        }
        outputConfiguration.getMaxSharedSurfaceCount();
        return new sa(outputConfiguration);
    }

    public static void bz(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    private static void g(bkn bknVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d18) / 1.99999d);
            g(bknVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * dSqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = dSqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double dAtan2 = Math.atan2(d12 - d9, d15 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d16 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 += dAtan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * dCos;
        double d28 = d26 * dSin;
        double d29 = d25 * dSin;
        double d30 = d26 * dCos;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d32 * dSin3;
        double d34 = d6 * dSin2;
        double d35 = d34 * dCos3;
        double d36 = d31 * dSin2;
        double d37 = d6 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = d2;
        double d40 = dAtan22;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = dAtan2;
        double d44 = d;
        while (i < iCeil) {
            int i2 = i;
            double d45 = d43 + (d40 / iCeil);
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d45 - d43;
            double dTan = Math.tan(d46 / 2.0d);
            double dSin5 = (Math.sin(d46) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * dSin5);
            int i3 = iCeil;
            double d48 = d29 + d30 + (d10 * dSin2 * dCos4) + (d37 * dSin4);
            double d49 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
            d42 = (dSin4 * d36) + (dCos4 * d37);
            d41 = (d32 * dSin4) - (d34 * dCos4);
            bknVar.d((float) (d44 + (d41 * dSin5)), (float) d47, (float) (d49 - (dSin5 * d41)), (float) (d48 - (dSin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            dCos2 = dCos2;
            d36 = d36;
            d39 = d48;
            iCeil = i3;
            dSin2 = dSin2;
            d10 = d5;
        }
    }

    private static Object h(abv abvVar, uiq uiqVar, uhb uhbVar) {
        abvVar.f();
        return bay.o(new np(uiqVar, 6), uhbVar);
    }

    private static aar i(ado adoVar, uiq uiqVar, Object obj, ayc aycVar) {
        aar aarVar;
        aycVar.t(-422486137, adoVar);
        if (adoVar.r()) {
            aycVar.u(-212147649);
            ((ayg) aycVar).Y();
            aarVar = ((Boolean) uiqVar.a(obj)).booleanValue() ? aar.b : ((Boolean) uiqVar.a(adoVar.d())).booleanValue() ? aar.c : aar.a;
        } else {
            aycVar.u(-211873516);
            ayg aygVar = (ayg) aycVar;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                azz azzVar = new azz(false, bap.c);
                aygVar.ac(azzVar);
                objR = azzVar;
            }
            azr azrVar = (azr) objR;
            if (((Boolean) uiqVar.a(adoVar.d())).booleanValue()) {
                azrVar.b(true);
            }
            aarVar = ((Boolean) uiqVar.a(obj)).booleanValue() ? aar.b : ((Boolean) azrVar.a()).booleanValue() ? aar.c : aar.a;
            aygVar.Y();
        }
        ((ayg) aycVar).Y();
        return aarVar;
    }

    public static uhf l() {
        return (uhf) byr.a.a();
    }

    public static /* synthetic */ bwq m(bws bwsVar, uiu uiuVar, uif uifVar, bmz bmzVar, int i) {
        Object obj = null;
        bmz bmzVar2 = (i & 4) != 0 ? null : bmzVar;
        if (bmzVar2 != null) {
            return new bzq(bmzVar2, null, (bxv) bwsVar, uiuVar, uifVar);
        }
        bxv bxvVar = (bxv) bwsVar;
        byz byzVar = bxvVar.N;
        byzVar.b();
        while (true) {
            bdp bdpVar = (bdp) byzVar.b;
            int i2 = bdpVar.b;
            if (i2 == 0) {
                break;
            }
            Object obj2 = ((Reference) bdpVar.c(i2 - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        bwq bwqVar = (bwq) obj;
        if (bwqVar != null) {
            bwqVar.g(uiuVar, uifVar);
            return bwqVar;
        }
        byz byzVar2 = bxvVar.S;
        return new bzq(byzVar2.j(), byzVar2, bxvVar, uiuVar, uifVar);
    }

    public static /* synthetic */ void n(bws bwsVar) {
        bwsVar.f(true);
    }

    public static bij o(buo buoVar, int i) {
        bij bijVar = buoVar.B().q;
        if (bijVar != null && (bijVar.o & i) != 0) {
            while (bijVar != null) {
                int i2 = bijVar.n;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return bijVar;
                }
                bijVar = bijVar.q;
            }
        }
        return null;
    }

    public static int p(bii biiVar, bii biiVar2) {
        if (a.ao(biiVar, biiVar2)) {
            return 2;
        }
        return !bay.y(biiVar, biiVar2) ? 0 : 1;
    }

    public static boolean q(bvm bvmVar) {
        if (bvmVar.h == null) {
            return false;
        }
        bvm bvmVarJ = bvmVar.j();
        return (bvmVarJ != null ? bvmVarJ.h : null) == null || bvmVar.t.b;
    }

    public static bik r(bik bikVar, uiv uivVar) {
        return bikVar.cM(new LayoutElement(uivVar));
    }

    public static long s(bry bryVar) {
        return bryVar.j(0L);
    }

    public static long t(bry bryVar) {
        return bryVar.k(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bkg u(bry bryVar) {
        bry bryVarO = bryVar.o();
        if (bryVarO != null) {
            return bryVarO.n(bryVar, true);
        }
        long j = ((bte) bryVar).c;
        return new bkg(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
    }

    public static bkg v(bry bryVar) {
        return x(bryVar).n(bryVar, true);
    }

    public static bkg w(bry bryVar) {
        bry bryVarX = x(bryVar);
        long jH = bryVarX.h() >> 32;
        long jH2 = bryVarX.h() & 4294967295L;
        bkg bkgVarN = bryVarX.n(bryVar, true);
        float f = bkgVarN.b;
        float f2 = bkgVarN.c;
        float f3 = bkgVarN.d;
        float f4 = bkgVarN.e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f5 = (int) jH;
        if (f > f5) {
            f = f5;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= f5) {
            f5 = f3;
        }
        if (f != f5) {
            int i = (int) jH2;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            float f6 = i;
            if (f4 > f6) {
                f4 = f6;
            }
            if (f2 > f6) {
                f2 = f6;
            }
            if (f2 != f4) {
                long jL = bryVarX.l((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL2 = bryVarX.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                long jL3 = bryVarX.l((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
                long jL4 = bryVarX.l((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL2 >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jL4 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jL3 >> 32));
                float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jL & 4294967295L));
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jL2 & 4294967295L));
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jL4 & 4294967295L));
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jL3 & 4294967295L));
                return new bkg(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
            }
        }
        return bkg.a;
    }

    public static bry x(bry bryVar) {
        bry bryVar2;
        bwi bwiVar;
        bry bryVarO = bryVar.o();
        while (true) {
            bry bryVar3 = bryVarO;
            bryVar2 = bryVar;
            bryVar = bryVar3;
            if (bryVar == null) {
                break;
            }
            bryVarO = bryVar.o();
        }
        bwi bwiVar2 = bryVar2 instanceof bwi ? (bwi) bryVar2 : null;
        if (bwiVar2 == null) {
            return bryVar2;
        }
        do {
            bwiVar = bwiVar2;
            bwiVar2 = bwiVar2.w;
        } while (bwiVar2 != null);
        return bwiVar;
    }

    public static float y(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static bks z(nll nllVar) {
        if (!nllVar.j()) {
            return null;
        }
        Object obj = nllVar.c;
        return obj != null ? new bkt((Shader) obj) : new blr(bko.i(nllVar.a));
    }

    public void bG(Rect rect, View view, RecyclerView recyclerView, ld ldVar) {
        ((kr) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public EdgeEffect cE(RecyclerView recyclerView) {
        throw null;
    }

    public void cG(int i, int i2, Object obj) {
        bI();
    }

    public byi(char[] cArr) {
    }

    public byi(qrh qrhVar) {
        qrhVar.getClass();
    }

    public void bI() {
    }

    public void cF() {
    }

    public void bH(Canvas canvas, RecyclerView recyclerView) {
    }

    public void cH(int i, int i2) {
    }

    public void cI(int i, int i2) {
    }

    public void f(Canvas canvas, RecyclerView recyclerView) {
    }
}
