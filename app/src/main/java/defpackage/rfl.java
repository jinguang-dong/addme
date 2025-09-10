package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfl implements rev {
    private final /* synthetic */ int a;

    public rfl(int i) {
        this.a = i;
    }

    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) {
        bm bmVarF;
        if (this.a != 0) {
            try {
                bmVarF = ch.f(view);
            } catch (IllegalStateException unused) {
                bmVarF = null;
            }
            if (bmVarF == null) {
                throw new IllegalStateException(a.bz(view, "View ", " does not have a Fragment set"));
            }
            if (bmVarF == null || bmVarF.P != view) {
                return;
            }
            rfoVar.b("fragment", bmVarF.getClass().getName());
            String str = bmVarF.G;
            if (str != null) {
                rfoVar.b("fragment_tag", str);
                return;
            }
            return;
        }
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        Outline outline = new Outline();
        if (outlineProvider != null) {
            outlineProvider.getOutline(view, outline);
        }
        char c = outline.isEmpty() ? (char) 1 : outline.getRadius() >= 0.0f ? (char) 3 : (char) 4;
        rfoVar.c("clipToOutline", view.getClipToOutline());
        rfoVar.b("outlineProvider", outlineProvider == ViewOutlineProvider.BACKGROUND ? "BACKGROUND" : outlineProvider == ViewOutlineProvider.BOUNDS ? "BOUNDS" : outlineProvider == ViewOutlineProvider.PADDED_BOUNDS ? "PADDED_BOUNDS" : String.valueOf(outlineProvider));
        rfoVar.b("outline_mode", c != 1 ? c != 2 ? c != 3 ? "PATH" : "ROUNDED_RECT" : "NOT_EMPTY" : "EMPTY");
        rfoVar.d("outline_alpha", outline.getAlpha());
        if (c == 3) {
            Rect rect = new Rect();
            outline.getRect(rect);
            rfoVar.d("outline_radius", outline.getRadius());
            rfoVar.b("outline_rect", rect.toShortString());
        }
    }
}
