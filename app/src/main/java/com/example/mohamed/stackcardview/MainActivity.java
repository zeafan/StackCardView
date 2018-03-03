package com.example.mohamed.stackcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {
CardStack cardStack;
adapterClss card_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InilImage();
        cardStack=(CardStack)findViewById(R.id.container);
        cardStack.setContentResource(R.layout.adapter_card);
        cardStack.setStackMargin(20);
        cardStack.setAdapter(card_adapter);
        cardStack.setListener(this);

    }

    private void InilImage() {
        card_adapter=new adapterClss(getApplicationContext(),0);
        card_adapter.add(R.drawable.img1);
        card_adapter.add(R.drawable.img2);
        card_adapter.add(R.drawable.img3);
        card_adapter.add(R.drawable.img4);
        card_adapter.add(R.drawable.img5);
        card_adapter.add(R.drawable.img6);

    }

    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
