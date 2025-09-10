package defpackage;

import android.graphics.RectF;
import android.util.Size;
import j$.util.Collection;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tes {
    public static final sgv a = sgv.g("tes");
    private final rtl b;

    public tes(rtl rtlVar) {
        this.b = rtlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sgt, shi] */
    public final Optional a(foy foyVar, Size size, tdv tdvVar, sbp sbpVar) {
        Optional optionalA = tdvVar.a();
        if (optionalA.isEmpty()) {
            ((sgt) a.c().M(5864)).s("Camera is not tracking, can't create a scene frame anchor.");
            return Optional.empty();
        }
        ?? r0 = optionalA.get();
        final teu teuVarJ = this.b.j(size, r0, tdvVar.b);
        txn txnVarN = rup.n((fnp) Collection.EL.stream(sbpVar).filter(new mdn(16)).map(new qoi(18)).findAny().orElseGet(new Supplier() { // from class: ter
            @Override // java.util.function.Supplier
            public final Object get() {
                ((sgt) tes.a.c().M(5865)).s("No valid person anchor in the scene. Creating a scene frame anchor based on an arbitrary point.");
                return teuVarJ.a(new float[]{0.5f, 0.5f}, 3.0f);
            }
        }));
        float[] fArrM = r0.m();
        txn txnVarC = teuVarJ.c(0.0f, size.getHeight(), new qat(new rug(txnVarN.a, txnVarN.b, txnVarN.c), new rug(fArrM[0], fArrM[1], fArrM[2])));
        if (txnVarC == null) {
            ((sgt) a.c().M(5863)).s("Unable to create scene anchor, plane intersection does not exist");
            return Optional.empty();
        }
        fow fowVar = new fow(new float[]{txnVarC.a, txnVarC.b, txnVarC.c}, r0.i());
        txm txmVarB = teuVarJ.b(rup.n(fowVar), new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()));
        if (txmVarB == null) {
            return Optional.empty();
        }
        try {
            return Optional.of(new teq(foyVar.c(fowVar), txmVarB.a, txmVarB.b));
        } catch (fnx | fnz | foa e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5862)).s("Unable to create anchor.");
            return Optional.empty();
        }
    }
}
