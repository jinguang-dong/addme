package defpackage;

import android.util.Log;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.reflection.Consumer2;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dts implements Consumer2 {
    final /* synthetic */ dtw a;
    private final Executor b;
    private final dtz c;
    private final WindowAreaComponent d;
    private int e;

    public dts(dtw dtwVar, Executor executor, dtz dtzVar, WindowAreaComponent windowAreaComponent) {
        executor.getClass();
        dtzVar.getClass();
        windowAreaComponent.getClass();
        this.a = dtwVar;
        this.b = executor;
        this.c = dtzVar;
        this.d = windowAreaComponent;
    }

    public void accept(int i) {
        int i2 = this.e;
        this.e = i;
        this.b.execute(new mnd(i, i2, this, this.a, 1));
    }

    public static /* synthetic */ void $r8$lambda$ejBVDgJJoSxAhsjcPWpzIdNJCB0(int i, int i2, dts dtsVar, dtw dtwVar) {
        if (i == 0) {
            String str = dtw.b;
            dtwVar.g = false;
            dtsVar.c.em();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                Log.e(dtw.b, a.bv(i, GAQqzWiWWcYOgy.vWrlxWC));
                return;
            } else {
                dtz dtzVar = dtsVar.c;
                return;
            }
        }
        if (i2 == 2) {
            dtz dtzVar2 = dtsVar.c;
            return;
        }
        dtz dtzVar3 = dtsVar.c;
        WindowAreaComponent windowAreaComponent = dtsVar.d;
        ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
        rearDisplayPresentation.getClass();
        int i3 = dug.a;
        dtzVar3.el(new dtm(windowAreaComponent, rearDisplayPresentation, dug.a()));
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
        accept(((Number) obj).intValue());
    }
}
