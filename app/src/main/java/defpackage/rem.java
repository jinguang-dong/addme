package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rem implements sxh {
    public List a;
    public final /* synthetic */ ren b;

    public rem(ren renVar) {
        this.b = renVar;
    }

    @Override // defpackage.sxh
    public final syu a() {
        ren renVar = this.b;
        rsf rsfVarU = qsz.u("Initialize ".concat(String.valueOf(renVar.a)));
        try {
            synchronized (renVar.c) {
                if (this.a == null) {
                    this.a = renVar.d;
                    renVar.d = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((sxi) it.next()).a(ambientController));
                } catch (Exception e) {
                    arrayList.add(ske.L(e));
                }
            }
            syu syuVarA = ske.G(arrayList).a(new ozi(this, 16), sxo.a);
            rsfVarU.a(syuVarA);
            rsfVarU.close();
            return syuVarA;
        } catch (Throwable th) {
            try {
                rsfVarU.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
