package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mga extends ki {
    private final String[] d;
    private final String[] e;

    public mga(Resources resources, hbj hbjVar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(resources.getStringArray(R.array.storage_saver_settings_changed)));
        ArrayList arrayList2 = hbjVar.o(gzo.bA) ? new ArrayList(Arrays.asList(resources.getStringArray(R.array.storage_saver_settings_changed_detail))) : new ArrayList(Arrays.asList(resources.getStringArray(R.array.storage_saver_settings_changed_detail_default_res)));
        if (hbjVar.p(hax.c)) {
            arrayList.add(resources.getString(R.string.storage_saver_settings_changed_8));
            arrayList2.add(resources.getString(R.string.storage_saver_settings_changed_detail_8));
        }
        this.d = (String[]) arrayList.toArray(new String[0]);
        this.e = (String[]) arrayList2.toArray(new String[0]);
    }

    @Override // defpackage.ki
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ lg d(ViewGroup viewGroup, int i) {
        return new mfz(new TextView(viewGroup.getContext()));
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ void i(lg lgVar, int i) {
        TextView textView = ((mfz) lgVar).s;
        Context context = textView.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String[] strArr = this.d;
        spannableStringBuilder.append(strArr[i], new TextAppearanceSpan(context, R.style.ChangedSettingsText), 33);
        spannableStringBuilder.append('\n');
        String[] strArr2 = this.e;
        spannableStringBuilder.append(strArr2[i], new TextAppearanceSpan(context, R.style.ChangedSettingsDetailText), 33);
        textView.setText(spannableStringBuilder);
        textView.setContentDescription(String.valueOf(context.getString(R.string.settings_changed_item_description, strArr[i])).concat(String.valueOf(strArr2[i])));
    }
}
