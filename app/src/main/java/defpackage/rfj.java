package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfj implements rev {
    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) throws NoSuchFieldException {
        RecyclerView recyclerView;
        ki kiVar;
        int iB;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView2 = (RecyclerView) view;
            rfoVar.c("recyclerView_hasFixedSize", recyclerView2.s);
            ki kiVar2 = recyclerView2.l;
            if (kiVar2 != null) {
                rfoVar.e("recyclerView_adapter_itemCount", kiVar2.a());
                rfoVar.c("recyclerView_adapter_hasStableIds", kiVar2.b);
            }
            kn knVar = recyclerView2.E;
            if (knVar != null) {
                rfoVar.c("recyclerView_itemAnimator_isRunning", knVar.h());
            }
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("u");
                declaredField.setAccessible(true);
                rfoVar.c("recyclerView_mLayoutWasDefered", declaredField.getBoolean(view));
            } catch (ReflectiveOperationException unused) {
            }
            try {
                Field declaredField2 = RecyclerView.class.getDeclaredField("ak");
                declaredField2.setAccessible(true);
                rfoVar.e("recyclerView_mInterceptRequestLayoutDepth", declaredField2.getInt(view));
            } catch (ReflectiveOperationException unused2) {
            }
            try {
                Field declaredField3 = RecyclerView.class.getDeclaredField("v");
                declaredField3.setAccessible(true);
                rfoVar.c("recyclerView_mLayoutSuppressed", declaredField3.getBoolean(view));
            } catch (ReflectiveOperationException unused3) {
            }
        }
        if (view.getParent() instanceof RecyclerView) {
            lg lgVarH = ((RecyclerView) view.getParent()).h(view);
            int i = -1;
            if (lgVarH.r != null && (recyclerView = lgVarH.q) != null && (kiVar = recyclerView.l) != null && (iB = recyclerView.b(lgVarH)) != -1 && lgVarH.r == kiVar) {
                i = iB;
            }
            rfoVar.e("recyclerView_viewHolder_adapterPosition", i);
            rfoVar.e("recyclerView_viewHolder_layoutPosition", lgVarH.b());
            rfoVar.b("recyclerView_viewHolder_itemId", Long.toString(lgVarH.e));
            rfoVar.c(YyLACfm.kXYdDEYOFa, lgVarH.t());
            rfoVar.b("recyclerView_viewHolder_viewType", (CharSequence) rwc.i(qsz.c(view.getContext().getResources(), lgVarH.f)).e(Integer.toString(lgVarH.f)));
        }
    }
}
