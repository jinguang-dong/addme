package defpackage;

import android.content.Context;
import android.os.Environment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrt implements tzt {
    private final tzx a;

    public lrt(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lsr a() {
        mfl mflVar = new mfl();
        Context contextB = ((imm) this.a).b();
        return new lsr(Environment.isExternalStorageEmulated() ? contextB.getExternalFilesDir(null) : contextB.getNoBackupFilesDir(), contextB.getExternalFilesDir(null), mflVar);
    }
}
