package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nna implements tzt {
    private final tzx a;

    public nna(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final PackageManager a() {
        PackageManager packageManager = ((imm) this.a).b().getPackageManager();
        packageManager.getClass();
        return packageManager;
    }
}
