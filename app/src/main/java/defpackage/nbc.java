package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbc extends BaseAdapter {
    public final ArrayList a;
    public Object b;
    public boolean c;
    public boolean d;

    public nbc(Context context) {
        nbd nbdVarA = nbe.a();
        ltg ltgVar = ltg.MEDIA_STORE;
        nbdVarA.j(ltgVar);
        nbdVarA.l(context.getString(R.string.default_title));
        nbdVarA.h(R.drawable.normal_mode_thumb);
        nbdVarA.c(context.getString(R.string.default_desc));
        nbe nbeVarA = nbdVarA.a();
        nbd nbdVarA2 = nbe.a();
        nbdVarA2.j(ltg.MARS_STORE);
        nbdVarA2.l(context.getString(R.string.mars_title));
        nbdVarA2.h(R.drawable.quantum_gm_ic_lock_vd_theme_24);
        nbdVarA2.c(context.getString(R.string.mars_desc));
        nbdVarA2.d(context.getString(R.string.mars_not_available_reason_account));
        this.a = new ArrayList(sbp.m(nbeVarA, nbdVarA2.a()));
        this.b = ltgVar;
    }

    public final int a(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                throw new IllegalArgumentException("Invalid item key: ".concat(String.valueOf(String.valueOf(obj))));
            }
            if (((nbe) arrayList.get(i)).a == obj) {
                return i;
            }
            i++;
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nbe getItem(int i) {
        return (nbe) this.a.get(i);
    }

    public final void c(nbe nbeVar) {
        this.a.set(a(nbeVar.a), nbeVar);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) throws Resources.NotFoundException {
        gga ggaVar;
        Context context = viewGroup.getContext();
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.popup_menu_item, viewGroup, false);
            ggaVar = new gga(view);
            view.setTag(ggaVar);
        } else {
            ggaVar = (gga) view.getTag();
        }
        if (ggaVar != null) {
            nbe nbeVar = (nbe) this.a.get(i);
            OptionalInt optionalInt = nbeVar.c;
            if (optionalInt.isPresent()) {
                ((ImageView) ggaVar.d).setImageResource(optionalInt.getAsInt());
            }
            OptionalInt optionalInt2 = nbeVar.d;
            if (optionalInt2.isPresent()) {
                ((ImageView) ggaVar.d).setColorFilter(optionalInt2.getAsInt(), PorterDuff.Mode.SRC_IN);
            }
            Object obj = ggaVar.c;
            String str = nbeVar.b;
            TextView textView = (TextView) obj;
            textView.setText(str);
            boolean z = nbeVar.j;
            if (z) {
                Optional optional = nbeVar.e;
                if (optional.isPresent()) {
                    TextView textView2 = (TextView) ggaVar.a;
                    textView2.setText((CharSequence) optional.get());
                    textView2.setVisibility(0);
                } else {
                    ((TextView) ggaVar.a).setVisibility(8);
                }
            } else {
                Optional optional2 = nbeVar.f;
                if (optional2.isPresent()) {
                    TextView textView3 = (TextView) ggaVar.a;
                    textView3.setText((CharSequence) optional2.get());
                    textView3.setVisibility(0);
                    OptionalInt optionalInt3 = nbeVar.g;
                    if (optionalInt3.isPresent()) {
                        textView3.setTextColor(optionalInt3.getAsInt());
                    }
                } else {
                    ((TextView) ggaVar.a).setVisibility(8);
                }
            }
            Optional optional3 = nbeVar.h;
            ImageButton imageButton = (ImageButton) ggaVar.b;
            imageButton.setFocusable(false);
            if (optional3.isPresent()) {
                imageButton.setOnClickListener(optional3.get());
                imageButton.setContentDescription(context.getString(R.string.menu_help_button_announce, str));
                imageButton.setVisibility(0);
                OptionalInt optionalInt4 = nbeVar.i;
                if (optionalInt4.isPresent()) {
                    imageButton.setColorFilter(optionalInt4.getAsInt(), PorterDuff.Mode.SRC_IN);
                }
            } else {
                imageButton.setOnClickListener(null);
                imageButton.setContentDescription(null);
                imageButton.setVisibility(8);
            }
            cog.l(view, new ahg(view, ggaVar, context, 5));
            view.setEnabled(z);
            if (z) {
                ((ImageView) ggaVar.d).setAlpha(1.0f);
            } else {
                ((ImageView) ggaVar.d).setAlpha(0.3f);
            }
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.menu_item_padding_horizontal);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.menu_item_padding_vertical);
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.menu_item_disable_padding_top);
            int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R.dimen.menu_item_disable_padding_bottom);
            if (z || !nbeVar.f.isPresent()) {
                view.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
            } else {
                view.setPadding(dimensionPixelOffset, dimensionPixelOffset3, dimensionPixelOffset, dimensionPixelOffset4);
            }
            cku ckuVar = new cku();
            ckuVar.g((ConstraintLayout) view);
            int id = ((ImageView) ggaVar.d).getId();
            ckuVar.e(id);
            ckuVar.i(id, 1, 0, 1);
            ckuVar.i(id, 3, 0, 3);
            ckuVar.i(id, 2, textView.getId(), 1);
            if (!z && nbeVar.f.isPresent()) {
                ckuVar.i(id, 4, 0, 4);
            }
        }
        return view;
    }

    public nbc(List list) {
        this.a = new ArrayList(list);
    }
}
