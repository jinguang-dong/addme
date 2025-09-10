package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gko {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gko(eue eueVar, eue eueVar2, eue eueVar3, ree reeVar, ree reeVar2) {
        this.f = fbe.a(150, new esi(this, 0));
        this.a = eueVar;
        this.d = eueVar2;
        this.b = eueVar3;
        this.c = reeVar;
        this.e = reeVar2;
    }

    public gko(Context context, dvs dvsVar, gga ggaVar, WorkDatabase workDatabase, ebx ebxVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.c = dvsVar;
        this.a = ggaVar;
        this.e = workDatabase;
        this.b = ebxVar;
        this.d = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        new cpo(null, null);
    }

    public gko(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, byte[] bArr) {
        uemVar.getClass();
        this.a = uemVar;
        this.d = uemVar2;
        uemVar3.getClass();
        this.f = uemVar3;
        uemVar4.getClass();
        this.b = uemVar4;
        uemVar5.getClass();
        this.c = uemVar5;
        uemVar6.getClass();
        this.e = uemVar6;
    }

    public gko(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6) {
        uemVar.getClass();
        this.c = uemVar;
        this.d = uemVar2;
        uemVar3.getClass();
        this.a = uemVar3;
        uemVar4.getClass();
        this.f = uemVar4;
        uemVar5.getClass();
        this.b = uemVar5;
        uemVar6.getClass();
        this.e = uemVar6;
    }

    public gko(mhq mhqVar, mhp mhpVar, out outVar) {
        this.d = new AtomicBoolean(false);
        ovx ovxVar = new ovx(false);
        this.e = ovxVar;
        this.f = owb.a(ovxVar);
        this.a = mhqVar;
        this.b = mhpVar;
        this.c = outVar;
    }
}
