package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dza implements dwy {
    public static final String a = dwj.a("CommandHandler");
    public final Context b;
    public final Map c = new HashMap();
    public final Object d = new Object();
    public final dxo e;

    public dza(Context context, dxo dxoVar) {
        this.b = context;
        this.e = dxoVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent c(Context context, ebm ebmVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        f(intent, ebmVar);
        return intent;
    }

    static Intent d(Context context, ebm ebmVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        f(intent, ebmVar);
        return intent;
    }

    static ebm e(Intent intent) {
        return new ebm(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void f(Intent intent, ebm ebmVar) {
        intent.putExtra("KEY_WORKSPEC_ID", ebmVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", ebmVar.b);
    }

    @Override // defpackage.dwy
    public final void a(ebm ebmVar, boolean z) {
        synchronized (this.d) {
            dze dzeVar = (dze) this.c.remove(ebmVar);
            this.e.c(ebmVar);
            if (dzeVar != null) {
                dwj.b();
                ebm ebmVar2 = dzeVar.c;
                Objects.toString(ebmVar2);
                dzeVar.a();
                if (z) {
                    dzeVar.g.execute(new dzg(dzeVar.d, d(dzeVar.a, ebmVar2), dzeVar.b));
                }
                if (dzeVar.i) {
                    dzeVar.g.execute(new dzg(dzeVar.d, b(dzeVar.a), dzeVar.b));
                }
            }
        }
    }
}
