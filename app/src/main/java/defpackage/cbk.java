package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cbk {
    public final int a;

    public /* synthetic */ cbk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cbk) && this.a == ((cbk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a.p(i, 0) ? "Button" : a.p(i, 1) ? INRGuObcrHjSQz.qaYgCkAyAvv : a.p(i, 2) ? "Switch" : a.p(i, 3) ? "RadioButton" : a.p(i, 4) ? "Tab" : a.p(i, 5) ? "Image" : a.p(i, 6) ? "DropdownList" : a.p(i, 7) ? "Picker" : a.p(i, 8) ? "Carousel" : "Unknown";
    }
}
