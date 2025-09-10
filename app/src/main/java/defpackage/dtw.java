package defpackage;

import android.app.Activity;
import android.os.Binder;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.Consumer2;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtw extends dtr {
    public static final String b;
    public final WindowAreaComponent c;
    public dtp d;
    public dtp e;
    public boolean f;
    public boolean g;
    public final HashMap h;
    private Consumer2 i;

    static {
        int i = ukb.a;
        b = new uji(dtw.class).c();
    }

    public dtw(WindowAreaComponent windowAreaComponent) {
        this.c = windowAreaComponent;
        dtp dtpVar = dtp.a;
        this.d = dtpVar;
        this.e = dtpVar;
        this.h = new HashMap();
    }

    @Override // defpackage.dtr
    public final urk a() {
        return new urf(new aie(this, (uhb) null, 4));
    }

    @Override // defpackage.dtr
    public final void b(Binder binder, Activity activity, Executor executor, dtz dtzVar) {
        if (!a.ao(binder.getInterfaceDescriptor(), "WINDOW_AREA_REAR_DISPLAY")) {
            executor.execute(new mb(dtzVar, 16));
        } else if (a.ao(this.e, dtp.a)) {
            ukc.C(ung.j(ujp.aa(executor)), null, 0, new dnl(this, activity, executor, dtzVar, (uhb) null, 2), 3);
        } else {
            e(activity, executor, dtzVar);
        }
    }

    public final void d(Activity activity, Executor executor, dub dubVar) {
        if (a.ao(this.d, dtp.e)) {
            new IllegalStateException("The WindowArea feature is currently active, WindowAreaInfo#getActiveSessioncan be used to get an instance of the current active session");
            dubVar.em();
        } else {
            if (!a.ao(this.d, dtp.d)) {
                new IllegalStateException("The WindowArea feature is currently not available to be entered");
                dubVar.em();
                return;
            }
            this.f = true;
            WindowAreaComponent windowAreaComponent = this.c;
            dtt dttVar = new dtt(this, executor, dubVar, windowAreaComponent);
            this.i = dttVar;
            windowAreaComponent.startRearDisplaySession(activity, dttVar);
        }
    }

    public final void e(Activity activity, Executor executor, dtz dtzVar) {
        if (!a.ao(this.e, dtp.d)) {
            new IllegalStateException("The WindowArea feature is currently not available to be entered");
            dtzVar.em();
        } else {
            this.g = true;
            WindowAreaComponent windowAreaComponent = this.c;
            windowAreaComponent.startRearDisplayPresentationSession(activity, new dts(this, executor, dtzVar, windowAreaComponent));
        }
    }

    public final void f(dto dtoVar, dtp dtpVar, duz duzVar) {
        HashMap map = this.h;
        dty dtyVar = (dty) map.get("WINDOW_AREA_REAR_DISPLAY");
        dtp dtpVar2 = dtp.b;
        if (!a.ao(dtpVar, dtpVar2)) {
            if (dtyVar == null) {
                dtyVar = new dty(duzVar, dtx.a, new Binder("WINDOW_AREA_REAR_DISPLAY"), this.c);
            }
            dtyVar.e.put(dtoVar, new dtq(dtoVar, dtpVar));
            dtyVar.a = duzVar;
            map.put("WINDOW_AREA_REAR_DISPLAY", dtyVar);
            return;
        }
        if (dtyVar != null) {
            HashMap map2 = dtyVar.e;
            for (Object obj : map2.values()) {
                obj.getClass();
                if (!a.ao(((dtq) obj).a, dtpVar2)) {
                    map2.put(dtoVar, new dtq(dtoVar, dtpVar));
                    return;
                }
            }
            map.remove("WINDOW_AREA_REAR_DISPLAY");
        }
    }

    @Override // defpackage.dtr
    public final void c(Binder binder, Activity activity, Executor executor, dub dubVar) {
        if (!a.ao(binder.getInterfaceDescriptor(), OPuAVreQM.aqaiDftNTBbtDr)) {
            executor.execute(new mb(dubVar, 17));
        } else if (a.ao(this.d, dtp.a)) {
            ukc.C(ung.j(ujp.aa(executor)), null, 0, new dnl(this, activity, executor, dubVar, (uhb) null, 3), 3);
        } else {
            d(activity, executor, dubVar);
        }
    }
}
