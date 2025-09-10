package defpackage;

import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inj implements tzt {
    private final tzx a;

    public inj(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final UserManager a() {
        UserManager userManager = (UserManager) ((imx) this.a.a()).a(imx.n);
        userManager.getClass();
        return userManager;
    }
}
