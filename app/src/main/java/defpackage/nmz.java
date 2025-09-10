package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmz implements tzt {
    private final tzx a;
    private final tzx b;

    public nmz(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final PackageInfo a() throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = ((nna) this.a).a().getPackageInfo(((imm) this.b).b().getPackageName(), 0);
            packageInfo.getClass();
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("getPackageInfo for getPackageName should always succeed.", e);
        }
    }
}
