package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class glz implements Runnable {
    public final /* synthetic */ gmc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ glz(gmc gmcVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.a = gmcVar;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            gmc gmcVar = this.a;
            gmcVar.m();
            out.a();
            if (this.b) {
                gmcVar.d.l(gmcVar.b.getString(R.string.external_wired_mic_disconnected));
            } else if (this.c) {
                gmcVar.d.l(gmcVar.b.getString(R.string.external_bluetooth_mic_disconnected));
            }
            gmcVar.e.a(gmcVar.d);
            return;
        }
        boolean z = this.c;
        boolean z2 = this.b;
        gmc gmcVar2 = this.a;
        if (!z || z2 || gmcVar2.f.ak("pref_ext_mic_bluetooth_chip_display_count") <= 3) {
            gmcVar2.m();
            out.a();
            if (z2 && z) {
                gmcVar2.d.l(gmcVar2.b.getString(R.string.external_mic_connected));
            } else if (z2) {
                gmcVar2.d.l(gmcVar2.b.getString(R.string.external_wired_mic_connected));
            } else if (z) {
                gmcVar2.d.l(gmcVar2.b.getString(R.string.external_bluetooth_mic_connected));
            }
            gmcVar2.e.a(gmcVar2.d);
        }
    }
}
