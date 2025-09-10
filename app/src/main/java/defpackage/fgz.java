package defpackage;

import android.content.Context;
import android.graphics.RectF;
import com.google.ar.core.R;
import j$.io.BufferedReaderRetargetClass;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fgz {
    public final qin a;
    public fhb b;
    public float c = 3.0f;
    public boolean d = false;
    public int e = 0;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public RectF k;
    public final qkl l;

    public fgz(Context context, qin qinVar) {
        String str = (String) BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.boba_pip_vertex)))).collect(Collectors.joining("\n"));
        String str2 = (String) BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.boba_pip_fragment)))).collect(Collectors.joining("\n"));
        qjv qjvVar = new qjv(qinVar);
        qjvVar.a(new qml(qkl.d(qinVar, str)));
        qjvVar.a(new qml(qkl.b(qinVar, str2)));
        this.l = qjvVar.b();
        this.a = qinVar;
    }

    public final synchronized float a() {
        return 1.0f - ((this.e * 0.49800003f) / 255.0f);
    }
}
