package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.ar.core.R;
import j$.io.BufferedReaderRetargetClass;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lje {
    public final qin a;
    public Color b = Color.valueOf(Color.parseColor("#FF00FF"));
    public float c = 1.0f;
    public float d = 0.2f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 3.0f;
    public final PointF i = new PointF();
    public final PointF j = new PointF(50.0f, 50.0f);
    public final PointF k = new PointF(300.0f, 300.0f);
    public final PointF l = new PointF(0.0f, 0.0f);
    public final Rect m = new Rect();
    public final qkl n;

    public lje(Context context, qin qinVar) {
        Stream streamLines = BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.pip_vertex))));
        String str = yoGAhrpjU.ofxJgHux;
        String str2 = (String) streamLines.collect(Collectors.joining(str));
        String str3 = (String) BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.pip_fragment)))).collect(Collectors.joining(str));
        qjv qjvVar = new qjv(qinVar);
        qjvVar.a(new qml(qkl.d(qinVar, str2)));
        qjvVar.a(new qml(qkl.b(qinVar, str3)));
        this.n = qjvVar.b();
        this.a = qinVar;
    }
}
