package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tnt implements tqy {
    static {
        tow towVar = tow.a;
        tra traVar = tra.a;
    }

    private static final void g(tqr tqrVar) throws tpz {
        if (tqrVar != null && !tqrVar.p()) {
            throw new tro().a();
        }
    }

    @Override // defpackage.tqy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tqr e(byte[] bArr, int i, int i2, tow towVar) throws tpz {
        tqr tqrVarB = b(bArr, i, i2, towVar);
        g(tqrVarB);
        return tqrVarB;
    }

    public tqr b(byte[] bArr, int i, int i2, tow towVar) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqr] */
    @Override // defpackage.tqy
    public final /* bridge */ /* synthetic */ Object c(InputStream inputStream, tow towVar) throws tpz {
        ton tonVarK = ton.K(inputStream);
        ?? F = f(tonVarK, towVar);
        tonVarK.z(0);
        g(F);
        return F;
    }

    @Override // defpackage.tqy
    public final /* bridge */ /* synthetic */ Object d(byte[] bArr, tow towVar) {
        return e(bArr, 0, bArr.length, towVar);
    }
}
