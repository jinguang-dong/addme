package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exk implements eqo {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public exk(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [ete, java.lang.Object] */
    @Override // defpackage.eqo
    public final /* synthetic */ esw a(Object obj, int i, int i2, eqm eqmVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        exi exiVar;
        fan fanVar;
        if (this.a != 0) {
            esw eswVarC = ((exz) this.b).c((Uri) obj, eqmVar);
            if (eswVarC == null) {
                return null;
            }
            return ewz.a(this.c, ((exx) eswVarC).c(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof exi) {
            exiVar = (exi) inputStream;
            z = false;
        } else {
            z = true;
            exiVar = new exi(inputStream, (etl) this.c);
        }
        Queue queue = fan.a;
        synchronized (queue) {
            fanVar = (fan) queue.poll();
        }
        if (fanVar == null) {
            fanVar = new fan();
        }
        fan fanVar2 = fanVar;
        fanVar2.b = exiVar;
        fau fauVar = new fau(fanVar2);
        exj exjVar = new exj(exiVar, fanVar2);
        try {
            Object obj2 = this.b;
            esw eswVarA = ((ewx) obj2).a(new exe(fauVar, ((ewx) obj2).f, ((ewx) obj2).g, 0), i, i2, eqmVar, exjVar);
            fanVar2.a();
            if (z) {
                exiVar.b();
            }
            return eswVarA;
        } finally {
        }
    }

    @Override // defpackage.eqo
    public final /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        if (this.a != 0) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        return true;
    }
}
