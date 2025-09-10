package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import androidx.wear.ambient.AmbientModeSupport;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap$EL;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsn {
    public boolean a;
    public Object b;
    public final Object c;

    public rsn() {
        this.a = false;
        this.b = null;
        this.c = null;
    }

    public final qzn a() {
        return new qzq(new qzn() { // from class: qzo
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rvu] */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Set] */
            @Override // defpackage.qzn
            public final qzm a(final qxf qxfVar) {
                qzm[] qzmVarArr;
                byte[] bArr;
                qzm qzmVar;
                qzm[] qzmVarArr2;
                int length;
                rsn rsnVar = this.a;
                ?? r0 = rsnVar.c;
                qzl qzlVar = qzm.a;
                Context context = qxfVar.c;
                final String str = (String) r0.apply(context);
                final boolean z = rsnVar.a;
                final ?? r11 = rsnVar.b;
                rww rwwVarY = rnt.y(new rww() { // from class: qzk
                    @Override // defpackage.rww
                    public final Object fr() {
                        return new qzm(qxfVar, str, z, r11);
                    }
                });
                AtomicReference atomicReference = (AtomicReference) ConcurrentMap$EL.computeIfAbsent(qzlVar.b, str, new mcx(9));
                do {
                    qzmVarArr = (qzm[]) atomicReference.get();
                    bArr = null;
                    if (qzmVarArr == null || (length = qzmVarArr.length) == 0) {
                        qzm qzmVar2 = (qzm) rwwVarY.fr();
                        qzmVar = qzmVar2;
                        qzmVarArr2 = new qzm[]{qzmVar2};
                    } else {
                        qzm qzmVar3 = qzmVarArr[0];
                        if (qzmVar3.d.equals(LmJPKwPBa.PhA)) {
                            qzmVar = qzmVar3;
                            qzmVarArr2 = null;
                        } else {
                            qzmVar = (qzm) rwwVarY.fr();
                            qzmVarArr2 = new qzm[length + 1];
                            qzmVarArr2[0] = qzmVar;
                            System.arraycopy(qzmVarArr, 0, qzmVarArr2, 1, length);
                        }
                    }
                    if (qzmVarArr2 == null) {
                        break;
                    }
                } while (!a.v(atomicReference, qzmVarArr, qzmVarArr2));
                if (qzmVarArr2 != null) {
                    rnu rnuVar = new rnu(qzlVar, bArr);
                    AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(qzlVar, bArr);
                    if (qzz.a == null) {
                        synchronized (qzz.class) {
                            if (qzz.a == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    context.registerReceiver(new qzz(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                }
                                qzz.a = rnuVar;
                                qzz.b = ambientController;
                            }
                        }
                    }
                }
                boolean z2 = qzmVar.e;
                rnt.F(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
                return qzmVar;
            }
        });
    }

    public final void b(Set set) {
        this.b = scn.F(set);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void c(oos oosVar) {
        synchronized (this.c) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(oosVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void d(oor oorVar) {
        oos oosVar;
        synchronized (this.c) {
            if (this.b != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.c) {
                        oosVar = (oos) this.b.poll();
                        if (oosVar == null) {
                            this.a = false;
                            return;
                        }
                    }
                    oosVar.a(oorVar);
                }
            }
        }
    }

    public rsn(byte[] bArr) {
        this.c = new Object();
    }

    public rsn(rvu rvuVar) {
        this.b = sfd.a;
        this.a = false;
        this.c = rvuVar;
    }
}
