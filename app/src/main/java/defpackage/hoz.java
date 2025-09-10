package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoz implements tzt {
    private final tzx a;
    private final tzx b;

    public hoz(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Handler a() {
        our ourVar = (our) this.a.a();
        return ojl.cg(ourVar, "MicrovideoQSharedStartup");
    }
}
