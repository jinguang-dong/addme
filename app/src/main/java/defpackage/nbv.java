package defpackage;

import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbv implements imj {
    private final RemoteControlView a;
    private Date b;

    public nbv(RemoteControlView remoteControlView) {
        this.a = remoteControlView;
    }

    @Override // defpackage.imj
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.NOTIFICATION_CHIP;
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.b;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // defpackage.imj
    public final void i() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.b = date;
    }

    @Override // defpackage.imj
    public final void m() {
        this.a.setVisibility(0);
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return true;
    }

    @Override // defpackage.imj
    public final boolean r() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return 6;
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.imj
    public final /* synthetic */ void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
    }
}
