package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eg extends fo {
    public boolean a;
    public boolean b;
    final /* synthetic */ eo c;
    public AmbientMode.AmbientController d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(eo eoVar, Window.Callback callback) {
        super(callback);
        this.c = eoVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.F(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            eo eoVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            dm dmVarB = eoVar.b();
            if (dmVarB == null || !dmVarB.n(keyCode, keyEvent)) {
                em emVar = eoVar.z;
                if (emVar == null || !eoVar.N(emVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (eoVar.z == null) {
                        em emVarM = eoVar.M(0);
                        eoVar.I(emVarM, keyEvent);
                        boolean zN = eoVar.N(emVarM, keyEvent.getKeyCode(), keyEvent);
                        emVarM.k = false;
                        if (!zN) {
                        }
                    }
                    return false;
                }
                em emVar2 = eoVar.z;
                if (emVar2 != null) {
                    emVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof gb)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        AmbientMode.AmbientController ambientController = this.d;
        if (ambientController != null) {
            if (i == 0) {
                view = new View(((eu) ambientController.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        dm dmVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (dmVarB = this.c.b()) != null) {
            dmVarB.d(true);
        }
        return true;
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        eo eoVar = this.c;
        if (i == 108) {
            dm dmVarB = eoVar.b();
            if (dmVarB != null) {
                dmVarB.d(false);
                return;
            }
            return;
        }
        if (i == 0) {
            em emVarM = eoVar.M(0);
            if (emVarM.m) {
                eoVar.y(emVarM, false);
            }
        }
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        gb gbVar = menu instanceof gb ? (gb) menu : null;
        if (i == 0) {
            if (gbVar == null) {
                return false;
            }
            i = 0;
        }
        if (gbVar != null) {
            gbVar.j = true;
        }
        AmbientMode.AmbientController ambientController = this.d;
        if (ambientController != null && i == 0) {
            eu euVar = (eu) ambientController.a;
            if (!euVar.b) {
                euVar.c.f();
                euVar.b = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (gbVar != null) {
            gbVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        gb gbVar = this.c.M(0).h;
        if (gbVar != null) {
            super.onProvideKeyboardShortcuts(list, gbVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.fo, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        eo eoVar = this.c;
        if (!eoVar.r || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        Context context = eoVar.h;
        fh fhVar = new fh(context, callback);
        ff ffVar = eoVar.n;
        if (ffVar != null) {
            ffVar.f();
        }
        ef efVar = new ef(eoVar, fhVar);
        dm dmVarB = eoVar.b();
        if (dmVarB != null) {
            eoVar.n = dmVarB.c(efVar);
        }
        if (eoVar.n == null) {
            eoVar.A();
            ff ffVar2 = eoVar.n;
            if (ffVar2 != null) {
                ffVar2.f();
            }
            if (eoVar.o == null) {
                if (eoVar.x) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        on onVar = new on(context, 0);
                        onVar.getTheme().setTo(themeNewTheme);
                        context = onVar;
                    }
                    eoVar.o = new ActionBarContextView(context);
                    eoVar.p = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    eoVar.p.setWindowLayoutType(2);
                    eoVar.p.setContentView(eoVar.o);
                    eoVar.p.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    eoVar.o.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    eoVar.p.setHeight(-2);
                    eoVar.q = new av(eoVar, 10, null);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) eoVar.t.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(eoVar.s());
                        eoVar.o = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (eoVar.o != null) {
                eoVar.A();
                eoVar.o.i();
                fg fgVar = new fg(eoVar.o.getContext(), eoVar.o, efVar);
                if (efVar.c(fgVar, fgVar.a)) {
                    fgVar.g();
                    eoVar.o.h(fgVar);
                    eoVar.n = fgVar;
                    if (eoVar.J()) {
                        eoVar.o.setAlpha(0.0f);
                        ejs ejsVarM = con.m(eoVar.o);
                        ejsVarM.j(1.0f);
                        eoVar.I = ejsVarM;
                        eoVar.I.l(new ed(eoVar));
                    } else {
                        eoVar.o.setAlpha(1.0f);
                        eoVar.o.setVisibility(0);
                        if (eoVar.o.getParent() instanceof View) {
                            View view = (View) eoVar.o.getParent();
                            int[] iArr = con.a;
                            coe.b(view);
                        }
                    }
                    if (eoVar.p != null) {
                        eoVar.i.getDecorView().post(eoVar.q);
                    }
                } else {
                    eoVar.n = null;
                }
            }
            eoVar.E();
        }
        eoVar.E();
        ff ffVar3 = eoVar.n;
        if (ffVar3 != null) {
            return fhVar.e(ffVar3);
        }
        return null;
    }
}
