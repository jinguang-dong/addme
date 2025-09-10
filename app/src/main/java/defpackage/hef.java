package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hef implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public hef(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
        }
        return b();
    }

    public final Boolean b() {
        switch (this.b) {
            case 0:
                gzi gziVar = gzo.a;
                return false;
            case 1:
                return Boolean.valueOf(((hbj) this.a.a()).p(gze.c));
            case 2:
                gzi gziVar2 = gzo.a;
                return false;
            case 3:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.n));
            case 4:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.o));
            case 5:
                hbj hbjVar = (hbj) this.a.a();
                return Boolean.valueOf(hbjVar.p(haa.L) && hbjVar.p(haa.M));
            case 6:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.f));
            case 7:
                hbj hbjVar2 = (hbj) this.a.a();
                return Boolean.valueOf(hbjVar2.p(haa.J) && hbjVar2.p(haa.K));
            case 8:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.Q));
            case 9:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.P));
            case 10:
                return Boolean.valueOf(((hbj) this.a.a()).p(haa.U));
            case 11:
                hbj hbjVar3 = (hbj) this.a.a();
                hbjVar3.getClass();
                return Boolean.valueOf((!hbjVar3.p(gze.h) || nvl.j == null || nvl.k == null || nvl.l == null || nvl.m == null) ? false : true);
            case 12:
                return Boolean.valueOf(((idt) this.a.a()).e());
            case 13:
                return Boolean.valueOf(qpt.bW((hbj) this.a.a()));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hbj hbjVar4 = (hbj) this.a.a();
                return Boolean.valueOf(hbjVar4.p(haq.a) && hbjVar4.p(gym.aa));
            case 15:
                int i = ((imm) this.a).b().getApplicationInfo().flags;
                return Boolean.valueOf(((i & 1) == 0 || (i & 128) == 128) ? false : true);
            case 16:
                Context contextB = ((imm) this.a).b();
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) contextB.getSystemService("device_policy");
                return Boolean.valueOf(Settings.Global.getInt(contextB.getContentResolver(), "device_demo_mode", 0) == 1 && devicePolicyManager != null && devicePolicyManager.isAdminActive(new ComponentName("com.google.android.retaildemo", "com.google.android.retaildemo.DemoDeviceAdminReceiver")));
            case 17:
                return Boolean.valueOf(!((rwc) ((tzu) this.a).a).h());
            default:
                Boolean bool = (Boolean) ((rwc) ((tzu) this.a).a).e(false);
                bool.booleanValue();
                return bool;
        }
    }
}
