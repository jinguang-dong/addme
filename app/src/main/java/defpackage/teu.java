package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class teu {
    private static final sgv a = sgv.g("teu");
    private final Size b;
    private final fnp c;
    private final txk d;

    public teu(Size size, fnp fnpVar, txk txkVar) {
        this.b = size;
        this.c = fnpVar;
        this.d = txkVar;
    }

    private final ruf d(float f, float f2) {
        txn txnVarE = e(f, f2, 0.0f);
        txn txnVarE2 = txn.g(e(f, f2, 1.0f), txnVarE).e();
        return new ruf(new rug(txnVarE.a, txnVarE.b, txnVarE.c), new rug(txnVarE2.a, txnVarE2.b, txnVarE2.c));
    }

    private final txn e(float f, float f2, float f3) {
        txk txkVarL = rup.l(this.c);
        txk txkVar = new txk(txk.a);
        txk.b(this.d, txkVarL, txkVar);
        float[] fArr = txkVar.b;
        Matrix.invertM(fArr, 0, fArr, 0);
        Size size = this.b;
        float height = size.getHeight();
        float height2 = (height - f2) / size.getHeight();
        float width = f / size.getWidth();
        return txkVar.a(new txo((width + width) - 1.0f, (height2 + height2) - 1.0f, (f3 + f3) - 1.0f));
    }

    final fnp a(float[] fArr, float f) {
        rug rugVarA = d(fArr[0], fArr[1]).a();
        txn txnVarE = new txn(rugVarA.a, rugVarA.b, rugVarA.c).e();
        fnp fnpVar = this.c;
        float fA = txn.a(rup.o(fnpVar.m()).f(-1.0f).e(), txnVarE);
        if (Math.abs(fA) < 1.0E-5d) {
            ((sgt) a.c().M(5867)).s("Camera direction and ray direction are orthogonal.");
            return null;
        }
        txn txnVarD = txn.d(rup.n(fnpVar), txnVarE.f(f / fA));
        txl txlVar = new txl();
        txlVar.b();
        return new fow(new float[]{txnVarD.a, txnVarD.b, txnVarD.c}, new float[]{txlVar.a, txlVar.b, txlVar.c, txlVar.d});
    }

    final txm b(txn txnVar, RectF rectF) {
        float[] fArrM = this.c.m();
        qat qatVar = new qat(new rug(txnVar.a, txnVar.b, txnVar.c), new rug(fArrM[0], fArrM[1], fArrM[2]));
        txn txnVarC = c(rectF.left, rectF.top, qatVar);
        txn txnVarC2 = c(rectF.left, rectF.bottom, qatVar);
        txn txnVarC3 = c(rectF.right, rectF.bottom, qatVar);
        if (txnVarC == null || txnVarC2 == null || txnVarC3 == null) {
            ((sgt) a.c().M(5866)).s("Unable to get plane size.");
            return null;
        }
        return new txm(txn.g(txnVarC3, txnVarC2).b(), txn.g(txnVarC, txnVarC2).b());
    }

    final txn c(float f, float f2, qat qatVar) {
        ruf rufVarD = d(f, f2);
        rug rugVar = new rug();
        rug rugVarA = rufVarD.a();
        rug rugVar2 = rufVarD.a;
        rug rugVar3 = new rug(rugVar2);
        rug rugVar4 = (rug) qatVar.a;
        float fA = rug.a(rugVar4, rugVarA);
        if (Math.abs(fA) <= 1.0E-6d) {
            return null;
        }
        rug rugVar5 = (rug) qatVar.b;
        float fA2 = rug.a(new rug(rugVar5.a - rugVar3.a, rugVar5.b - rugVar3.b, rugVar5.c - rugVar3.c), rugVar4) / fA;
        if (fA2 < 0.0f) {
            return null;
        }
        rug rugVarD = rufVarD.b.d(fA2);
        rugVar.e(new rug(rugVar2.a + rugVarD.a, rugVar2.b + rugVarD.b, rugVar2.c + rugVarD.c));
        return new txn(new rug(rugVar).a, new rug(rugVar).b, new rug(rugVar).c);
    }
}
