package defpackage;

import j$.util.Collection;
import j$.util.Spliterators;
import j$.util.stream.StreamSupport;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpt implements fpr {
    private final ArrayDeque a = new ArrayDeque(10);

    @Override // defpackage.fpr
    public final synchronized fpq a() {
        ArrayDeque arrayDeque = this.a;
        if (Collection.EL.stream(arrayDeque).filter(new fla(2)).count() >= 4) {
            return fpq.RELIABLE;
        }
        return (fpq) StreamSupport.stream(Spliterators.spliteratorUnknownSize(arrayDeque.descendingIterator(), 0), false).filter(new fla(3)).findFirst().map(new fik(18)).orElse(fpq.TOO_FEW_LANDMARKS);
    }

    @Override // defpackage.fpr
    public final synchronized void c(fon fonVar) {
        if (fonVar.f().dO() != fnt.TRACKING) {
            this.a.clear();
            return;
        }
        fov fovVarD = fonVar.d();
        try {
            fnp fnpVarDN = fonVar.f().dN();
            int i = 0;
            for (int i2 = 0; i2 < fovVarD.c().remaining() / 4; i2++) {
                int i3 = i2 * 4;
                float fE = fovVarD.c().get(i3) - fnpVarDN.e();
                float f = fovVarD.c().get(i3 + 1) - fnpVarDN.f();
                float fG = fovVarD.c().get(i3 + 2) - fnpVarDN.g();
                if ((fE * fE) + (f * f) + (fG * fG) < 100.0f) {
                    i++;
                }
            }
            fps fpsVar = new fps(fovVarD.c().remaining() / 4, i);
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.size() == 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(fpsVar);
            if (fovVarD != null) {
                fovVarD.close();
            }
        } finally {
        }
    }

    @Override // defpackage.fpr
    public final /* synthetic */ void b() {
    }
}
