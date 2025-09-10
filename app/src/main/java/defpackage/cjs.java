package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs {
    static final boolean[] a = new boolean[3];

    static void a(cjo cjoVar, cjf cjfVar, cjn cjnVar) {
        cjnVar.p = -1;
        cjnVar.q = -1;
        int[] iArr = cjoVar.aq;
        if (iArr[0] != 2 && cjnVar.aq[0] == 4) {
            cjm cjmVar = cjnVar.J;
            int i = cjmVar.f;
            int iJ = cjoVar.j();
            cjm cjmVar2 = cjnVar.L;
            int i2 = iJ - cjmVar2.f;
            cjmVar.h = cjfVar.b(cjmVar);
            cjmVar2.h = cjfVar.b(cjmVar2);
            cjfVar.f(cjmVar.h, i);
            cjfVar.f(cjmVar2.h, i2);
            cjnVar.p = 2;
            cjnVar.Z = i;
            int i3 = i2 - i;
            cjnVar.V = i3;
            int i4 = cjnVar.ac;
            if (i3 < i4) {
                cjnVar.V = i4;
            }
        }
        if (iArr[1] == 2 || cjnVar.aq[1] != 4) {
            return;
        }
        cjm cjmVar3 = cjnVar.K;
        int i5 = cjmVar3.f;
        int iH = cjoVar.h();
        cjm cjmVar4 = cjnVar.M;
        int i6 = iH - cjmVar4.f;
        cjmVar3.h = cjfVar.b(cjmVar3);
        cjmVar4.h = cjfVar.b(cjmVar4);
        cjfVar.f(cjmVar3.h, i5);
        cjfVar.f(cjmVar4.h, i6);
        if (cjnVar.ab > 0 || cjnVar.ah == 8) {
            cjm cjmVar5 = cjnVar.N;
            cjmVar5.h = cjfVar.b(cjmVar5);
            cjfVar.f(cjmVar5.h, cjnVar.ab + i5);
        }
        cjnVar.q = 2;
        cjnVar.aa = i5;
        int i7 = i6 - i5;
        cjnVar.W = i7;
        int i8 = cjnVar.ad;
        if (i7 < i8) {
            cjnVar.W = i8;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
