package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mzp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzp(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                mzy mzyVar = (mzy) this.b;
                if (this.a == mzyVar.u) {
                    mzyVar.d();
                    break;
                }
                break;
            case 1:
                lrh lrhVar = (lrh) this.b;
                Sensor sensor = lrhVar.c;
                lrg lrgVar = lrhVar.d;
                SensorManager sensorManager = lrhVar.a;
                sensorManager.unregisterListener(lrgVar, sensor);
                sensorManager.registerListener(lrgVar, sensor, this.a);
                break;
            case 2:
                ((ModeSwitcher) this.b).smoothScrollTo(this.a, 0);
                break;
            case 3:
                nby nbyVar = (nby) this.b;
                if (nbyVar.c == null) {
                    nbyVar.c = (RemoteControlView) nbyVar.d.inflate();
                    nbyVar.e = new nbv(nbyVar.c);
                }
                int i = this.a;
                nbyVar.j.a(nbyVar.e);
                nbyVar.f = nbyVar.a.registerReceiver(nbyVar.i, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                nbyVar.g = true;
                nbyVar.j.g(imk.SMARTS);
                RemoteControlView remoteControlView = nbyVar.c;
                if (i >= 0) {
                    remoteControlView.a.setText(i + "%");
                } else {
                    remoteControlView.a.setText("--");
                }
                Intent intent = nbyVar.f;
                if (intent != null) {
                    nbyVar.a(intent);
                    nbyVar.f = null;
                    break;
                }
                break;
            case 4:
                int i2 = this.a;
                ((ntf) this.b).k.d("/night_sight_shooting_progress", ske.ah(i2));
                break;
            case 5:
                ((oga) this.b).k(this.a);
                break;
            case 6:
                ((qei) this.b).b.e(this.a);
                break;
            default:
                ((vdn) this.b).onStatus(this.a);
                break;
        }
    }

    public mzp(oga ogaVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = ogaVar;
    }
}
