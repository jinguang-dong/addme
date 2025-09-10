package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bp extends nh {
    boolean a;
    boolean b;
    public final ocq e = new ocq(new bo(this));
    final cwc d = new cwc(this);
    boolean c = true;

    public bp() {
        int i = 1;
        getSavedStateRegistry().b("android:support:lifecycle", new bw(this, i));
        er(new bn(this, i));
        this.j.add(new bn(this, 0));
        l(new dw(this, i));
    }

    private static boolean h(ch chVar, cwb cwbVar) {
        boolean zH = false;
        for (bm bmVar : chVar.b.g()) {
            if (bmVar != null) {
                if (bmVar.getHost() != null) {
                    zH |= h(bmVar.getChildFragmentManager(), cwbVar);
                }
                cz czVar = bmVar.Z;
                if (czVar != null && czVar.getLifecycle().a.a(cwb.d)) {
                    bmVar.Z.a.d(cwbVar);
                    zH = true;
                }
                if (bmVar.ae.a.a(cwb.d)) {
                    bmVar.ae.d(cwbVar);
                    zH = true;
                }
            }
        }
        return zH;
    }

    final void e() {
        while (h(eo(), cwb.c)) {
        }
    }

    public final ch eo() {
        return this.e.aN();
    }

    final View ep(View view, String str, Context context, AttributeSet attributeSet) {
        return ((bu) this.e.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    @Override // defpackage.nh, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.e.aO();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.nh, defpackage.dj, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.b(cwa.ON_CREATE);
        ((bu) this.e.a).e.r();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewEp = ep(view, str, context, attributeSet);
        return viewEp == null ? super.onCreateView(view, str, context, attributeSet) : viewEp;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((bu) this.e.a).e.s();
        this.d.b(cwa.ON_DESTROY);
    }

    @Override // defpackage.nh, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((bu) this.e.a).e.T(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.b = false;
        ((bu) this.e.a).e.y();
        this.d.b(cwa.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.d.b(cwa.ON_RESUME);
        ((bu) this.e.a).e.A();
    }

    @Override // defpackage.nh, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.aO();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        ocq ocqVar = this.e;
        ocqVar.aO();
        super.onResume();
        this.b = true;
        ocqVar.aP();
    }

    @Override // android.app.Activity
    protected void onStart() {
        ocq ocqVar = this.e;
        ocqVar.aO();
        super.onStart();
        this.c = false;
        if (!this.a) {
            this.a = true;
            ((bu) ocqVar.a).e.p();
        }
        ocqVar.aP();
        this.d.b(cwa.ON_START);
        ((bu) ocqVar.a).e.B();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.aO();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.c = true;
        e();
        ((bu) this.e.a).e.D();
        this.d.b(cwa.ON_STOP);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation")) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        return;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        return;
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.print(strConcat);
        printWriter.print("mCreated=");
        printWriter.print(this.a);
        printWriter.print(MyBPCgKwEjJI.WbtYJub);
        printWriter.print(this.b);
        printWriter.print(OPuAVreQM.erjSDFDVe);
        printWriter.print(this.c);
        if (getApplication() != null) {
            cyc.a(this).c(strConcat, printWriter);
        }
        this.e.aN().E(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewEp = ep(null, str, context, attributeSet);
        return viewEp == null ? super.onCreateView(str, context, attributeSet) : viewEp;
    }
}
