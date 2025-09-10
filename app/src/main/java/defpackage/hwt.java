package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwt {
    private static final sgv a = sgv.g("hwt");
    private final plc b;
    private final hwv c;
    private final int d;
    private final boolean e;
    private plb f;
    private boolean g;
    private volatile hww h = null;
    private final int i;
    private final qqq j;

    public hwt(plc plcVar, qqq qqqVar, hwv hwvVar, int i, int i2, int i3) {
        this.b = plcVar;
        this.j = qqqVar;
        this.c = hwvVar;
        this.d = i;
        this.i = i3;
        i2 = i2 != 1 ? 2 : i2;
        a.I(true);
        this.e = i2 == 1 && !hwvVar.b;
        this.g = false;
    }

    public final synchronized float a(lnl lnlVar, lnl lnlVar2) {
        hww hwwVar = this.h;
        if (!this.g || hwwVar == null) {
            return -1.0f;
        }
        long j = lnlVar.d;
        float f = lnlVar.h;
        float f2 = lnlVar.i;
        Rect rect = lnlVar.p;
        long j2 = lnlVar.c;
        long j3 = lnlVar.e;
        long j4 = lnlVar.o;
        long j5 = lnlVar2.d;
        float f3 = lnlVar2.h;
        float f4 = lnlVar2.i;
        Rect rect2 = lnlVar2.p;
        long j6 = lnlVar2.c;
        long j7 = lnlVar2.e;
        long j8 = lnlVar2.o;
        float[] fArrF = hwwVar.f(rect);
        float[] fArrF2 = hwwVar.f(rect2);
        long jC = hwwVar.c(j2, j3, fArrF);
        long jC2 = hwwVar.c(j4, j3, fArrF);
        long jB = hwwVar.b(j3, fArrF);
        long jC3 = hwwVar.c(j6, j7, fArrF2);
        long jC4 = hwwVar.c(j8, j7, fArrF2);
        long jB2 = hwwVar.b(j7, fArrF2);
        long jD = hww.d(jC, jB, j);
        float fA = hwwVar.a(f, f2, fArrF);
        long jD2 = hww.d(jC3, jB2, j5);
        float fA2 = hwwVar.a(f3, f4, fArrF2);
        String str = lnlVar.b;
        pas pasVar = hwwVar.d;
        float[] fArrE = hwwVar.e(str, jC2, jB, j, pasVar, fArrF, false);
        float[] fArrE2 = hwwVar.e(lnlVar2.b, jC4, jB2, j5, pasVar, fArrF2, false);
        qib qibVarC = qib.c(hwwVar.b.d(jD, fA, fArrE[0], fArrE[1], jD2, fA2, fArrE2[0], fArrE2[1]));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new float[]{0.0f, 0.0f});
        float f5 = pasVar.a;
        float fMax = 0.0f;
        arrayList.add(new float[]{f5, 0.0f});
        float f6 = pasVar.b;
        arrayList.add(new float[]{0.0f, f6});
        arrayList.add(new float[]{f5, f6});
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float[] fArrG = qibVarC.g((float[]) arrayList.get(i));
            fMax = (float) Math.max(fMax, Math.hypot(fArrG[0] - r7[0], fArrG[1] - r7[1]));
        }
        return fMax;
    }

    public final List b(long j, lnl lnlVar) throws Throwable {
        int i;
        Object obj;
        boolean z;
        qib qibVarC;
        hww hwwVar = this.h;
        if (lnlVar == null || hwwVar == null) {
            if (lnlVar == null) {
                ((sgt) a.b().M(1666)).u("Camera metadata not valid at : %d", j);
            } else {
                ((sgt) a.b().M(1665)).u("Gyro transform calculator not valid at : %d", j);
            }
            ArrayList arrayList = new ArrayList();
            hww hwwVar2 = this.h;
            if (hwwVar2 == null) {
                ((sgt) a.b().M(1664)).s("Gyro transform calculator not valid.");
                return arrayList;
            }
            for (int i2 = 0; i2 < hwwVar2.c; i2++) {
                arrayList.add(qib.d());
            }
            return arrayList;
        }
        d();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j2 = lnlVar.d;
        float f = lnlVar.h;
        float f2 = lnlVar.i;
        float[] fArrF = hwwVar.f(lnlVar.p);
        float fA = hwwVar.a(f, f2, fArrF);
        long j3 = lnlVar.c;
        long j4 = lnlVar.e;
        long j5 = lnlVar.o;
        long jC = hwwVar.c(j3, j4, fArrF);
        long jC2 = hwwVar.c(j5, j4, fArrF);
        long jB = hwwVar.b(j4, fArrF);
        int i3 = 0;
        float[] fArr = null;
        while (true) {
            i = hwwVar.c;
            if (i3 >= i) {
                break;
            }
            long j6 = i;
            long j7 = (i3 * jB) / j6;
            long j8 = jB / j6;
            long j9 = j2;
            long jD = hww.d(jC + j7, j8, j9);
            int i4 = i3;
            float[] fArrE = hwwVar.e(lnlVar.b, jC2 + j7, j8, j9, hwwVar.d, fArrF, true);
            float[] fArr2 = new float[9];
            float[] fArr3 = true != hwwVar.b.c(jD, fA, fArrE[0], fArrE[1], fArr2) ? fArr : fArr2;
            if (fArr3 != null) {
                arrayList2.add(qib.c(fArr3));
                fArr = fArr3;
            } else {
                arrayList2.add(null);
            }
            i3 = i4 + 1;
            j2 = j9;
        }
        boolean z2 = true;
        Object obj2 = hwwVar.e;
        synchronized (obj2) {
            try {
                AtomicReference atomicReference = hwwVar.f;
                List list = (List) atomicReference.get();
                int i5 = 0;
                while (i5 < i) {
                    qib qibVar = (qib) list.get(i5);
                    qib qibVar2 = (qib) arrayList2.get(i5);
                    if (qibVar == null || qibVar2 == null) {
                        z = z2;
                        obj = obj2;
                        ((sgt) hww.a.c().M(1672)).s("Previous or current projection matrix cannot be computed. Defaulting to identity");
                        arrayList3.add(qib.d());
                    } else {
                        float[] fArr4 = qibVar.c;
                        float f3 = fArr4[0];
                        float f4 = fArr4[4];
                        float f5 = fArr4[8];
                        float f6 = fArr4[5];
                        float f7 = fArr4[7];
                        float f8 = (f4 * f5) - (f6 * f7);
                        z = z2;
                        float f9 = fArr4[z ? 1 : 0];
                        float f10 = fArr4[3];
                        float f11 = fArr4[6];
                        double d = f3 * f8;
                        float f12 = f9 * ((f10 * f5) - (f6 * f11));
                        float f13 = fArr4[2];
                        obj = obj2;
                        double d2 = ((d + 0.0d) - f12) + (((f10 * f7) - (f4 * f11)) * f13);
                        if (d2 == 0.0d) {
                            qibVarC = null;
                        } else {
                            float f14 = (float) (1.0d / d2);
                            float f15 = f8 * f14;
                            float f16 = (-((f9 * f5) - (f13 * f7))) * f14;
                            float f17 = ((f9 * f6) - (f13 * f4)) * f14;
                            float f18 = (-((f10 * f5) - (f6 * f11))) * f14;
                            float f19 = ((f5 * f3) - (f13 * f11)) * f14;
                            float f20 = (-((f6 * f3) - (f13 * f10))) * f14;
                            float f21 = ((f10 * f7) - (f4 * f11)) * f14;
                            float f22 = (-((f7 * f3) - (f11 * f9))) * f14;
                            float f23 = ((f3 * f4) - (f9 * f10)) * f14;
                            float[] fArr5 = new float[9];
                            fArr5[0] = f15;
                            fArr5[z ? 1 : 0] = f16;
                            fArr5[2] = f17;
                            fArr5[3] = f18;
                            fArr5[4] = f19;
                            fArr5[5] = f20;
                            fArr5[6] = f21;
                            fArr5[7] = f22;
                            fArr5[8] = f23;
                            qibVarC = qib.c(fArr5);
                        }
                        if (qibVarC == null) {
                            try {
                                ((sgt) hww.a.c().M(1673)).s("Inverse cannot be computed. Defaulting to identity");
                                arrayList3.add(qib.d());
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } else {
                            float[] fArrF2 = qibVarC.f();
                            float[] fArr6 = new float[9];
                            int i6 = 3;
                            int i7 = 0;
                            while (i7 < i6) {
                                int i8 = 0;
                                while (i8 < i6) {
                                    int i9 = 0;
                                    while (i9 < i6) {
                                        int i10 = i7 * 3;
                                        int i11 = i10 + i8;
                                        fArr6[i11] = fArr6[i11] + (qibVar2.c[i10 + i9] * fArrF2[(i9 * 3) + i8]);
                                        i9++;
                                        i6 = 3;
                                    }
                                    i8++;
                                    i6 = 3;
                                }
                                i7++;
                                i6 = 3;
                            }
                            arrayList3.add(qib.c(fArr6));
                        }
                    }
                    i5++;
                    z2 = z;
                    obj2 = obj;
                }
                Object obj3 = obj2;
                atomicReference.set(arrayList2);
                return arrayList3;
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
            }
        }
    }

    public final synchronized void c() {
        this.g = false;
        plb plbVar = this.f;
        if (plbVar != null) {
            plbVar.close();
        }
        this.h = null;
    }

    public final synchronized void d() {
        plb plbVar = this.f;
        if (!this.g || plbVar == null) {
            return;
        }
        this.c.a(plbVar);
    }

    public final synchronized boolean e() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [inu, java.lang.Object] */
    public final synchronized void f(pas pasVar, String str) {
        if (!this.e) {
            qqq qqqVar = this.j;
            int i = this.d;
            int i2 = this.i;
            SizeF sizeF = (SizeF) qqqVar.e.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            sizeF.getClass();
            if (i2 != 1) {
                i2 = 2;
            }
            a.I(true);
            Object obj = qqqVar.a;
            Set sfmVar = ((rwc) obj).h() ? new sfm(((pjr) ((rwc) obj).c()).a) : sfd.a;
            this.h = new hww(sizeF, pasVar, ((kqp) qqqVar.d).b(), i, qqqVar.b, i2 == 1 ? (inz) qqqVar.c.a() : new inx(), sfmVar);
            plb plbVarB = this.b.b(str);
            this.f = plbVarB;
            if (plbVarB != null) {
                this.g = true;
            }
        }
    }
}
