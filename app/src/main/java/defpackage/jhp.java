package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhp implements tzt {
    private final tzx a;

    public jhp(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nan a() {
        Context contextB = ((imm) this.a).b();
        nao naoVar = new nao();
        naoVar.e = contextB.getString(R.string.cuttlefish_capturing_first);
        naoVar.h = contextB;
        naoVar.j = 10;
        naoVar.a = true;
        return naoVar.a();
    }
}
