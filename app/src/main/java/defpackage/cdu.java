package defpackage;

import android.text.Layout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdu {
    public final Layout a;
    private final List b;
    private final List c;
    private final boolean[] d;
    private char[] e;

    public cdu(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iU = ujp.u(this.a.getText(), '\n', length, 4);
            length = iU < 0 ? this.a.getText().length() : iU + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    private final float e(int i, boolean z) {
        Layout layout = this.a;
        int iO = ukc.o(i, layout.getLineEnd(layout.getLineForOffset(i)));
        return z ? layout.getPrimaryHorizontal(iO) : layout.getSecondaryHorizontal(iO);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdu.a(int, boolean, boolean):float");
    }

    public final int b(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int c(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char cCharAt = this.a.getText().charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760) {
                if (ujp.a(cCharAt, 8192) >= 0 && ujp.a(cCharAt, 8202) <= 0) {
                    if (cCharAt == 8199) {
                        cCharAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (cCharAt != 8287 && cCharAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    public final boolean d(int i) {
        Layout layout = this.a;
        return layout.getParagraphDirection(layout.getLineForOffset(b(i))) == -1;
    }
}
