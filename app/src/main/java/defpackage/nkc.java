package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkc implements nkm {
    private final rwc a;

    public nkc(rwc rwcVar) {
        this.a = rwcVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        rwc rwcVar = this.a;
        if (rwcVar.h()) {
            gmt gmtVar = (gmt) rwcVar.c();
            nao naoVar = new nao();
            Context context = gmtVar.a;
            naoVar.e = context.getResources().getString(R.string.locked_mode_before_recording);
            naoVar.h = context;
            naoVar.j = 12;
            naoVar.a = true;
            gmtVar.c = naoVar.a();
            nao naoVar2 = new nao();
            naoVar2.e = context.getResources().getString(R.string.locked_mode_will_exit_warning);
            naoVar2.h = context;
            naoVar2.j = 12;
            naoVar2.a = true;
            gmtVar.d = naoVar2.a();
            nao naoVar3 = new nao();
            naoVar3.e = context.getResources().getString(R.string.locked_mode_exit_message);
            naoVar3.h = context;
            naoVar3.j = 12;
            naoVar3.b = 3000;
            gmtVar.e = naoVar3.a();
        }
    }
}
