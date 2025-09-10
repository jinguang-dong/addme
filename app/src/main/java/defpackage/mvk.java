package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvk {
    private static final sgv e = sgv.g("mvk");
    public final mni a;
    public boolean b;
    public final luj c;
    public final ocq d;
    private final AccessibilityManager f;
    private final hbj g;

    public mvk(mni mniVar, ocq ocqVar, hbj hbjVar, AccessibilityManager accessibilityManager, luj lujVar) {
        new ArrayList();
        this.b = false;
        this.a = mniVar;
        this.d = ocqVar;
        this.g = hbjVar;
        this.f = accessibilityManager;
        this.c = lujVar;
    }

    public final boolean a() {
        mni mniVar = this.a;
        return mniVar != null && mniVar.k();
    }

    public final void b(Context context, int i) {
        int i2;
        mni mniVar = this.a;
        if (mniVar == null) {
            ((sgt) e.c().M(5064)).s("bottomSheetController is not ready");
            return;
        }
        out.a();
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, R.layout.hotshot_bottom_sheet_layout, frameLayout);
        TextView textView = (TextView) frameLayout.findViewById(R.id.hotshot_edu_info);
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.hotshot_edu_additional_info);
        c();
        if (this.g.p(gzt.b)) {
            if (i - 1 != 2) {
                c();
                i2 = true != this.f.isTouchExplorationEnabled() ? R.string.hotshot_vision_bottom_sheet_info_without_talkback : R.string.hotshot_vision_bottom_sheet_info;
            } else {
                c();
                i2 = R.string.hotshot_prompt_bottom_sheet_info;
            }
            textView.setText(context.getString(i2));
            String string = context.getString(R.string.hotshot_bottom_sheet_additional_info);
            if (i != 2) {
                string = String.valueOf(string).concat(String.valueOf(String.format(Locale.ROOT, " %s", context.getString(R.string.hotshot_bottom_sheet_turn_off_feature))));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            String string2 = context.getString(R.string.hotshot_edu_learn_more_url);
            if (!string2.isEmpty()) {
                SpannableString spannableString = new SpannableString(context.getString(R.string.hotshot_edu_learn_more));
                spannableString.setSpan(new URLSpan(string2), 0, spannableString.length(), 0);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setLinkTextColor(ojl.aO(textView2));
            con.g(textView2);
        } else {
            textView.setText(R.string.hotshot_bottom_sheet_info);
            textView2.setText(R.string.hotshot_bottom_sheet_additional_info);
        }
        Button button = (Button) frameLayout.findViewById(R.id.close_button);
        Button button2 = (Button) frameLayout.findViewById(R.id.try_hotshot_button);
        Button button3 = (Button) frameLayout.findViewById(R.id.close_button_with_try_hotshot);
        Button button4 = (Button) frameLayout.findViewById(R.id.education_button);
        Button button5 = (Button) frameLayout.findViewById(R.id.go_back_button);
        c();
        int i3 = 8;
        if (i == 3) {
            button2.setVisibility(0);
            button3.setVisibility(0);
            button.setVisibility(8);
            button4.setVisibility(8);
            button5.setVisibility(8);
            button2.setOnClickListener(new mlk(this, i3));
            button3.setOnClickListener(new mlk(this, 9));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setVisibility(0);
            button4.setVisibility(8);
            button5.setVisibility(8);
            button.setOnClickListener(new mlk(this, 10));
        }
        this.b = false;
        if (i == 2) {
            mniVar.o(15, R.string.hotshot_bottom_sheet_title, frameLayout);
        } else {
            mniVar.n(15, R.string.hotshot_bottom_sheet_title, frameLayout, null);
        }
    }

    public final void c() {
        gzg gzgVar = gzt.a;
    }
}
